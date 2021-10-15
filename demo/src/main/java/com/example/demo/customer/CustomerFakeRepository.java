package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Kate Ge", "password123", "kate@gmail"),
                new Customer(2L, "Lu Mao", "password123", "lu@gmail")
        );
    }
}
