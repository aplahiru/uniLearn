package lk.UniLearn.studentlearning.controllers;

import lk.UniLearn.studentlearning.Models.User;
import lk.UniLearn.studentlearning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/user/getUser/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable String userId){
        return userService.getOneUser(userId);
    }
}
