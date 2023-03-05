package com.rebel.SB.SpringBootBackend.controller;

import com.rebel.SB.SpringBootBackend.entity.User;
import com.rebel.SB.SpringBootBackend.extra.ApiResponse;
import com.rebel.SB.SpringBootBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list-users")
    public ResponseEntity<List<User>> getList()
    {
        List<User> users = this.userService.getALlUsers();

        return new ResponseEntity<>(users, HttpStatus.FOUND);

    }

    @GetMapping("/user/{Id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer Id)
    {

        return new ResponseEntity<>(this.userService.getById(Id), HttpStatus.FOUND);

    }

    @PutMapping("/update-user/{Id}")
    public ResponseEntity<User> udpateUser(@RequestBody User user , @PathVariable Integer Id)
    {
        User updatedUser = this.userService.updateUser(user, Id);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ApiResponse> deletById(@PathVariable Integer Id)
    {
          this.userService.deleteById(Id);

        return new ResponseEntity<ApiResponse>(new ApiResponse("User is successfully deleted from DB !! ", true) ,HttpStatus.OK);
    }

}
