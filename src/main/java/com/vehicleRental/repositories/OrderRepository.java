package com.vehicleRental.repositories;


import com.vehicleRental.domain.Orders;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface OrderRepository extends CrudRepository<Orders, Long> {
}
