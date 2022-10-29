package com.anagracetech.cms.customer;

import java.util.Arrays;
import java.util.List;

//@Repository
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        return Arrays.asList(
                new Customer(1L,"James Bond", "password123", "email@gmail.com"),
                new Customer(2L,"Jamila Ahmed", "123pass", "email@gmail.com")
        );
    }
}
