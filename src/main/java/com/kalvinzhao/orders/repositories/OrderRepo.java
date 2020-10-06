package com.kalvinzhao.orders.repositories;

import com.kalvinzhao.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
