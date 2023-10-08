package com.reactiveprogramming.reactive.service;

import com.reactiveprogramming.reactive.dao.CustomerDao;
import com.reactiveprogramming.reactive.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServcie {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> loadAllCustomers(){
        long start  = System.currentTimeMillis();
        List<Customer> customers = customerDao.getCustomers();
        long end = System.currentTimeMillis();
        System.out.println("total execution time: "+(end-start));
        return customers;
    }
}
