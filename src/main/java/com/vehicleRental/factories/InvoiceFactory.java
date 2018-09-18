package com.vehicleRental.factories;

import com.vehicleRental.domain.Customer;
import com.vehicleRental.domain.Invoices;

/**
 * Created by Long on 9/14/2018.
 */

public class InvoiceFactory
{
    public  static Invoices getInvoice(Customer customer)
    {
        Invoices invoices = new Invoices.Builder()
                .customer(customer)
                .build();
        return invoices;
    }
}
