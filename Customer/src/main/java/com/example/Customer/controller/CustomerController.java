package com.example.Customer.controller;

import com.example.Customer.model.Customer;
import com.example.Customer.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/createCustomer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        try{
            Customer _customer = customerRepository.save(new Customer(customer.getCustId(), customer.getName(), customer.getAccountNumber(), customer.getPhoneNumber(), customer.getAccountType()));
            return new ResponseEntity<>(_customer, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
