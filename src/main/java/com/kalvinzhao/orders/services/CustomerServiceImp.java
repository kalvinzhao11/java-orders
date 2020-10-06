package com.kalvinzhao.orders.services;

import com.kalvinzhao.orders.models.Customer;
import com.kalvinzhao.orders.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //anytime if any method is transactional, make the whole class transactional
@Service(value = "customerServices")
public class CustomerServiceImp implements CustomerService{

    @Autowired
    CustomerRepo customerrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customerrepos.save(customer);
    }
}
