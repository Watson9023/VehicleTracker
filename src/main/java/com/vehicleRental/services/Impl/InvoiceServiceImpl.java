package com.vehicleRental.services.Impl;

import com.vehicleRental.domain.Invoices;
import com.vehicleRental.repositories.InvoiceRepository;
import com.vehicleRental.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Long on 9/14/2018.
 */
@Component
public class InvoiceServiceImpl implements InvoiceService
{

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Invoices create(Invoices invoices)
    {
        return  invoiceRepository.save(invoices);
    }
    public Invoices read(long id)
    {
        return invoiceRepository.findOne(id);
    }
    public Invoices update(Invoices invoices)
    {
        return invoiceRepository.save(invoices);
    }
    public void delete(long id)
    {
        invoiceRepository.delete(id);
    }
    public Iterable<Invoices> findAll()
    {
        return  invoiceRepository.findAll();
    }


}
