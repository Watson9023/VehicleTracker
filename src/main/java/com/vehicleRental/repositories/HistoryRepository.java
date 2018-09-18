package com.vehicleRental.repositories;

import com.vehicleRental.domain.History;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface HistoryRepository extends CrudRepository<History, Long>
{
    History findByInvoices(long id);

}
