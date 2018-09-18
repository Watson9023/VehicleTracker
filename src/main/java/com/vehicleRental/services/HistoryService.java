package com.vehicleRental.services;

import com.vehicleRental.domain.History;

/**
 * Created by Long on 9/14/2018.
 */
public interface HistoryService
{
    History create(History history);
    History read(long id);
    History update(History history);
    void delete(long id);
    Iterable<History> findAll();
    History findByInvoices(long id);
}
