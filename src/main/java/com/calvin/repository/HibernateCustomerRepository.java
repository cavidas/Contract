package com.calvin.repository;

import com.calvin.model.Customer;

import java.util.List;

public interface HibernateCustomerRepository {
    List<Customer> findAll();
}
