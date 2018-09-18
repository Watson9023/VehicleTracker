package com.vehicleRental.services;

import com.vehicleRental.domain.Invoices;


/**
 * Created by Long on 9/14/2018.
 */
public interface InvoiceService
{
    Invoices create(Invoices invoices);
    Invoices read(long id);
    Invoices update(Invoices invoices);
    void delete(long id);
    Iterable<Invoices> findAll();
}
