package com.anagracetech.cms.customer;

import com.anagracetech.cms.exception.NotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {

    private  final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return customerRepo.getCustomer();
    }

    Customer getCustomer(Long id){
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("customer not found"));
    }
}
