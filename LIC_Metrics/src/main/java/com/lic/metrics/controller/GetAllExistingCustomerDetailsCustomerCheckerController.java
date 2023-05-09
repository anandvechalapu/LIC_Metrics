package com.lic.metrics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.metrics.model.Customer;
import com.lic.metrics.service.GetAllExistingCustomerDetailsCustomerCheckerControllerService;

@RestController
public class GetAllExistingCustomerDetailsCustomerCheckerController {
    
    @Autowired
    GetAllExistingCustomerDetailsCustomerCheckerControllerService service;
    
    @GetMapping("/customer/{customerId}")
    public Customer getCustomerDetails(@PathVariable Long customerId) {
        return service.findByCustomerId(customerId);
    }
}