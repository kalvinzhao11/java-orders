package com.kalvinzhao.orders.repositories;

import com.kalvinzhao.orders.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payments, Long> {
}
