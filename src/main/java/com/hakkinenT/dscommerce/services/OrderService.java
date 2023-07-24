package com.hakkinenT.dscommerce.services;

import com.hakkinenT.dscommerce.dto.OrderDTO;
import com.hakkinenT.dscommerce.dto.OrderItemDTO;
import com.hakkinenT.dscommerce.entities.*;
import com.hakkinenT.dscommerce.repositories.OrderItemRepository;
import com.hakkinenT.dscommerce.repositories.OrderRepository;
import com.hakkinenT.dscommerce.repositories.ProductRepository;
import com.hakkinenT.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private UserService service;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));

        authService.validateSelfOrAdmin(order.getClient().getId());

        OrderDTO dto = new OrderDTO(order);
        return dto;
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        Order order = new Order();
        order.setMoment(Instant.now());
        order.setStatus(OrderStatus.WAITING_PAYMENT);

        User user = service.authenticated();
        order.setClient(user);

        for(OrderItemDTO itemDto : dto.getItems()){
            Product product = productRepository.getReferenceById(itemDto.getProductId());
            OrderItem item = new OrderItem(order, product, itemDto.getQuantity(), product.getPrice());
            order.getItems().add(item);
        }
        repository.save(order);
        orderItemRepository.saveAll(order.getItems());

        return new OrderDTO(order);
    }
}
