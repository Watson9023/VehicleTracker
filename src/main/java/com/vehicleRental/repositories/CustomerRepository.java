package com.vehicleRental.repositories;

import com.vehicleRental.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Customer findByEmail(String email);
}
