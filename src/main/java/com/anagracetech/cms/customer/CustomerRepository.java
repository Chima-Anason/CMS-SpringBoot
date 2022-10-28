package com.anagracetech.cms.customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Repository
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        // TODO connect to real db
        return Collections.emptyList();
    }
}
