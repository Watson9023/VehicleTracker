package com.vehicleRental.repositories;

import com.vehicleRental.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{
    Category findByName(String name);
}
