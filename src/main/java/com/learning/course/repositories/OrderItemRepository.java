package com.learning.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.course.entities.OrderItem;
import com.learning.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
