package com.anagracetech.cms.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.userFakeCustomerRepo:True}")
    private Boolean userFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {

        };
    }

    @Bean
    CustomerRepo customerRepo(){
        return userFakeCustomerRepo ?
                new CustomerFakeRepository() :
                new CustomerRepository();
    }
}
