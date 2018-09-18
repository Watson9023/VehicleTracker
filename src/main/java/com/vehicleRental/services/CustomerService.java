package com.vehicleRental.services;

import com.vehicleRental.domain.Customer;

/**
 * Created by Long on 9/14/2018.
 */
public interface CustomerService {
    Customer create(Customer customer);
    Customer read(long id);
    Customer update(Customer customer);
    void delete(long id);
    Iterable<Customer> findAll();
    Customer availableEmail(String email);
}
