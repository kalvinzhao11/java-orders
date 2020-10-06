package com.kalvinzhao.orders.repositories;

import com.kalvinzhao.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
