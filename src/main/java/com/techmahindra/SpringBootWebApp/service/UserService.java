package com.techmahindra.SpringBootWebApp.service;

import com.techmahindra.SpringBootWebApp.Bean.User;
import com.techmahindra.SpringBootWebApp.Domain.UserDetails;
import com.techmahindra.SpringBootWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anurag Mishra on 10-12-2018.
 */

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user){
        UserDetails userDetails = new UserDetails();
        userDetails.setId(user.getId());
        userDetails.setName(user.getName());
        userRepository.save(userDetails);
        user.setId(userDetails.getId());
        return user;

    }

    public List<User> getUsers(){
        Iterable<UserDetails> userDetails = userRepository.findAll();
            List<User> users = new ArrayList();
        Iterator itr = userDetails.iterator();
        while (itr.hasNext()) {
            UserDetails UserDetails1 = (UserDetails) itr.next();
            User user = new User();
            user.setId(UserDetails1.getId());
            user.setName(UserDetails1.getName());
            users.add(user);
        }
        return users;

    }

    public void deleteUser(Long id){
       userRepository.deleteById(id);
    }
}
