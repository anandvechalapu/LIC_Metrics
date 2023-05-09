package com.lic.metrics.service;

import com.lic.metrics.repository.model.Customer;
import com.lic.metrics.repository.GetAllExistingCustomerDetailsCustomerCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetAllExistingCustomerDetailsCustomerCheckerControllerService {
    
    @Autowired
    GetAllExistingCustomerDetailsCustomerCheckerControllerRepository repository;
    
    public Customer findByCustomerId(Long customerId) {
        return repository.findByCustomerId(customerId);
    }
}