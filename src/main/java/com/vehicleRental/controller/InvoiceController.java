package com.vehicleRental.controller;

import com.vehicleRental.domain.Customer;
import com.vehicleRental.domain.Invoices;
import com.vehicleRental.factories.InvoiceFactory;
import com.vehicleRental.services.Impl.CustomerServiceImpl;
import com.vehicleRental.services.Impl.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Long on 9/14/2018.
 */
@Controller
@RequestMapping(path = "/invoice")
public class InvoiceController
{

    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    InvoiceServiceImpl invoiceService;

    private Invoices invoices;

    private Customer customer;

    @CrossOrigin
    @PostMapping(path="/{customerId}/addInvoice")
    public @ResponseBody
    Invoices create(@PathVariable long customerId)
    {
        customer = customerService.read(customerId);
        invoices = InvoiceFactory.getInvoice(customer);
        return  invoiceService.create(invoices);
    }
    @CrossOrigin
    @GetMapping (path="/{customerId}/findInvoice")
    public @ResponseBody
    Invoices findByCustomer (@PathVariable long customerId, @RequestParam long id)
    {
        return invoiceService.read(id);
    }

    @CrossOrigin
    @PostMapping (path="/{customerId}/updateInvoice")
    public @ResponseBody
    Invoices updateOrder (@PathVariable long customerId, @RequestParam long id) {


        customer = customerService.read(customerId);
        Invoices invoiceUpdate = new Invoices.Builder()
                .id(id)
                .customer(customer)
                .build();

        return invoiceService.update(invoiceUpdate);
    }
    @CrossOrigin
    @GetMapping (path="/deleteInvoice")
    public @ResponseBody void updateOrder (@RequestParam Long id) {
        invoiceService.delete(id);

    }
}
