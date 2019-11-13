package com.aimids.restspis.aimidsrestapis.resources.users;

import com.aimids.restspis.aimidsrestapis.models.User;
import com.aimids.restspis.aimidsrestapis.resourceimplementations.UserResourceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserResourceImplementation userResourceImplementation;

    /**
     * @param Id pass user ID
     * @return specific user
     */
    @RequestMapping(method = RequestMethod.GET, path = "/user/{Id}")
    public User getUser(@PathVariable Integer Id) {
        return userResourceImplementation.getSpecificUser(Id);
    }

    /**
     * @return list of users
     */
    @RequestMapping(method = RequestMethod.GET, path = "/users")
    public List<User> getAllUsers() {
        return userResourceImplementation.getAllUsers();
    }

    /**
     * @param user User to be created with filled input data
     * @return newly created user
     */
    @RequestMapping(method = RequestMethod.POST, path = "/user")
    public User createNewUser(@RequestBody User user) {
        return userResourceImplementation.registerNewUser(user);
    }

    /**
     * @param Id user Id to be deleted
     * @return deleted User
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/user/{Id}")
    public User removeUser(@PathVariable Integer Id) {
        return userResourceImplementation.removeUser(Id);
    }

    /**
     * @param Id for the User to be fetched
     * @return User
     */
    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public User getUserById(@RequestParam(value = "Id") Integer Id) {
        return userResourceImplementation.getSpecificUser(Id);
    }

}
