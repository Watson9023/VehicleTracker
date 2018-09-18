package com.vehicleRental.factories;

import com.vehicleRental.domain.Car;
import com.vehicleRental.domain.Orders;
import com.vehicleRental.domain.Rent;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Created by Long on 9/14/2018.
 */
public class RentFactory
{
    public static Rent getRent(Car car,String rentDate, String returnDate, BigDecimal totalPrice,
                               Orders order, int rentalDays,boolean outstanding)
    {
        Rent rent = new Rent.Builder()
                .car(car)
                .rentDate(rentDate)
                .returntDate(returnDate)
                .rentalDays(rentalDays)
                .totalPrice(totalPrice)
                .order(order)
                .outstanding(outstanding)
                .build();
        return  rent;
    }
}
