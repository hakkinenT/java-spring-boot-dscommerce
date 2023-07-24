package com.hakkinenT.dscommerce.services;

import com.hakkinenT.dscommerce.dto.OrderDTO;
import com.hakkinenT.dscommerce.dto.ProductDTO;
import com.hakkinenT.dscommerce.entities.Order;
import com.hakkinenT.dscommerce.entities.Product;
import com.hakkinenT.dscommerce.repositories.OrderRepository;
import com.hakkinenT.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));

        OrderDTO dto = new OrderDTO(order);
        return dto;
    }
}
