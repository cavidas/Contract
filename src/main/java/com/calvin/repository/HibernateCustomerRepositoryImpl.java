package com.calvin.repository;

import com.calvin.model.Customer;

import java.util.Collections;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements HibernateCustomerRepository {

    @Override
    public List<Customer> findAll() {

        Customer customer = new Customer();
        customer.setFirstName("Calvin");
        customer.setLastName("Han");

        return Collections.singletonList(customer);

    }

}
