package com.techmahindra.SpringBootWebApp.controller;

import com.techmahindra.SpringBootWebApp.Bean.User;
import com.techmahindra.SpringBootWebApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anurag Mishra on 10-12-2018.
 */


@Controller
public class AppController {
    @Autowired
    public UserService userService;

    @RequestMapping("/")
    public String index(){
        System.out.println("Welcome to Web Application");
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/userDetails", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        return userService.getUsers();

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void deleteUser(@PathVariable long id){
             userService.deleteUser(id);
    }

    @RequestMapping(value = "/showUser")
    public String showUsers(){
        return "UserDetails";
    }

    @RequestMapping(value = "/createUser")
    public String userpage(){
        return "createUser";
    }

    @RequestMapping(value = "/deleteUser")
    public String delete(){
        return "deleteUser";
    }


}
