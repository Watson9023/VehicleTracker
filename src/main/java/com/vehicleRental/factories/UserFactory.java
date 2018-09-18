package com.vehicleRental.factories;

import com.vehicleRental.domain.User;

/**
 * Created by Long on 9/14/2018.
 */
public class UserFactory {
    public static User getUser(String name, String surname,String password, String role)
    {
        User user=new User.Builder()
                .name(name)
                .surname(surname)
                .password(password)
                .role(role)
                .build();
        return user;
    }

    public static User getUserByID(Long userID, String name, String surname,String password, String role)
    {
        User user=new User.Builder()
                .userID(userID)
                .name(name)
                .surname(surname)
                .password(password)
                .role(role)
                .build();
        return user;
    }


}
