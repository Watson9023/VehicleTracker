package com.vehicleRental.services;

import com.vehicleRental.domain.Orders;

/**
 * Created by Long on 9/14/2018.
 */
public interface OrderService {

    Orders create(Orders orders);
    Orders read(long id);
    Orders update(Orders orders);
    void delete(long id);
    //Orders findByCustomer(Long id);
}
