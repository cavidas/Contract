package com.calvin;

import com.calvin.service.CustomerService;
import com.calvin.service.CustomerServiceImpl;

public class Application {
    public static void  main(String[] args){

        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());

    }

}

