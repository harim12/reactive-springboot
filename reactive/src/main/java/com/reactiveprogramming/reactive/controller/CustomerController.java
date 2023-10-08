package com.reactiveprogramming.reactive.controller;

import com.reactiveprogramming.reactive.service.CustomerServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerServcie customerServcie;

    public List<CustomerServcie> getAllCustomers(){
        
    }
}
