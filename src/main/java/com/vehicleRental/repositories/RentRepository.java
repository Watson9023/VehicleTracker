package com.vehicleRental.repositories;

import com.vehicleRental.domain.Rent;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface RentRepository extends CrudRepository<Rent, Long>
{
    Iterable<Rent> findAllById(long id);

}
