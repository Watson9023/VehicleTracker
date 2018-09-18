package com.vehicleRental.repositories;

import com.vehicleRental.domain.Car;
import com.vehicleRental.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface CarRepository extends CrudRepository<Car, Long>{
    Iterable<Car> findAllById(Category category);
    Car findCarsById(Long id);
}
