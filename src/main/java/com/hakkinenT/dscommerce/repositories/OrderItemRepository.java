package com.hakkinenT.dscommerce.repositories;

import com.hakkinenT.dscommerce.entities.OrderItem;
import com.hakkinenT.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
