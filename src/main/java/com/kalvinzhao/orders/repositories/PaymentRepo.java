package com.kalvinzhao.orders.repositories;

import com.kalvinzhao.orders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
}
