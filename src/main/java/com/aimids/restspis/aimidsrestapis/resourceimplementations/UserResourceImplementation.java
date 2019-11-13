package com.aimids.restspis.aimidsrestapis.resourceimplementations;

import com.aimids.restspis.aimidsrestapis.models.User;
import com.aimids.restspis.aimidsrestapis.services.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResourceImplementation {


    @Autowired
    UserDaoService userDaoService;

    public User getSpecificUser(Integer Id) {
        return userDaoService.getUser(Id);
    }

    public List<User> getAllUsers() {
        return userDaoService.getAllUsers();
    }

    public User registerNewUser(User user) {
        return userDaoService.createUser(user);
    }

    public User removeUser(Integer Id) {
        return userDaoService.removeUser(Id);
    }

}
