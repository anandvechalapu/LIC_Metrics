package com.lic.metrics.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
    @Id
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmailId;
    
    public Long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    public String getCustomerEmailId() {
        return customerEmailId;
    }
    
    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }
    
}