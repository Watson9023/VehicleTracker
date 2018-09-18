package com.vehicleRental.services;

import com.vehicleRental.domain.Category;

/**
 * Created by Long on 9/14/2018.
 */
public interface CategoryService {
    Category create(Category category);
    Category read(long id);
    Category update(Category category);
    void delete(long id);
    Category findByName(String name);
    Iterable<Category> readAll();
}
