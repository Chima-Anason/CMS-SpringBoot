package com.anagracetech.cms.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST......");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST......");
        System.out.println(customer);
    }

    @DeleteMapping(path ="{customer_Id}")
    void deleteCustomer(@PathVariable("customer_Id") Long id){
        System.out.println("DELETE REQUEST of customer with ID... "+ id);
    }
}
