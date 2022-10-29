package com.anagracetech.cms.customer;

import com.anagracetech.cms.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(path = "api/v1/customer")
@RestController
//@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }


    @GetMapping(path ="{customer_Id}")
    Customer getCustomer(@PathVariable("customer_Id") Long id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path ="{customer_Id}/exception")
    Customer getCustomerException(@PathVariable("customer_Id") Long id){
        throw new ApiRequestException("ApiRequestException for customer " + id);
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
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
