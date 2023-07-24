package com.hakkinenT.dscommerce.repositories;

import com.hakkinenT.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
