package com.rebel.SB.SpringBootBackend.service;

import com.rebel.SB.SpringBootBackend.entity.User;

import java.util.List;

public interface UserService
{
    //creating user
    public User createUser(User user);

    //getting list of users
    List<User> getALlUsers();

    //get user by Id
    public User getById(Integer id);

    //update user
    public User updateUser(User user, Integer id);

    //delete user by id
    public void deleteById(Integer id);
}
