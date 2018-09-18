package com.vehicleRental.repositories;

import com.vehicleRental.domain.Invoices;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Long on 9/14/2018.
 */
public interface InvoiceRepository extends CrudRepository<Invoices, Long>
{
    //Iterable<Rent> findAllById(long id);
}
