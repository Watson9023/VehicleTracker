package com.vehicleRental.factories;

import com.vehicleRental.domain.Customer;
import com.vehicleRental.domain.Orders;

/**
 * Created by Long on 9/14/2018.
 */
public class OrderFactory {

    public static Orders getOrder(String orderDate, Customer customer ) {

        Orders orders = new Orders.Builder()
                .customer(customer)
                .orderDate(orderDate)
                .build();
        return orders;
    }
}
