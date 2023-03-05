package com.rebel.SB.SpringBootBackend.controller;

import com.rebel.SB.SpringBootBackend.entity.User;
import com.rebel.SB.SpringBootBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> newUser(@RequestBody User user)
    {
       User adddedUser = this.userService.createUser(user);
        System.out.println("used added successfully");
       return new ResponseEntity<>(adddedUser, HttpStatus.CREATED);
    }

}
