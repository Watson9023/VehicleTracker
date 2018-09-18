package com.vehicleRental.repositories;

import com.vehicleRental.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Long on 9/14/2018.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);

}
