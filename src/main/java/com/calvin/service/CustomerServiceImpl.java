package com.calvin.service;

import com.calvin.model.Customer;
import com.calvin.repository.HibernateCustomerRepository;
import com.calvin.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private HibernateCustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }
}
