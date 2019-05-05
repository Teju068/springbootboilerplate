package com.aimids.restspis.aimidsrestapis.services;

import com.aimids.restspis.aimidsrestapis.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private int counter = 3;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Mahesh", "Belgaum"));
        users.add(new User(2, "Bhairu", "Varanasi"));
        users.add(new User(3, "Ramesh", "Lucknow"));
    }


    public List<User> getAllUsers() {
        if (!users.isEmpty()) {
            return users;
        } else {
            return null;
        }
    }

    public User getUser(Integer Id) {

        if (users != null) {

            for (User user : users) {

                if (user.getId().equals(Id)) {
                    return user;
                }
            }
        }

        return null;
    }

    public User createUser(User user) {
        user.setId(++counter);
        users.add(user);

        return user;
    }

    public User removeUser(Integer Id) {
        if (users != null) {
            for (User user : users) {
                if (user.getId().equals(Id)) {
                    users.remove(user);
                    return user;
                }
            }
        }

        return null;
    }
}
