package com.kalvinzhao.orders.services;

import com.kalvinzhao.orders.models.Customer;
import com.kalvinzhao.orders.models.Order;
import com.kalvinzhao.orders.repositories.CustomerRepo;
import com.kalvinzhao.orders.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //anytime if any method is transactional, make the whole class transactional
@Service(value = "orderServices")
public class OrderServiceImp implements OrderService{

    @Autowired
    OrderRepo orderrepos;

    @Transactional
    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }
}
