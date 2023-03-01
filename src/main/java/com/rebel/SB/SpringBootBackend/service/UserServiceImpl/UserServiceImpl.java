package com.rebel.SB.SpringBootBackend.service.UserServiceImpl;

import com.rebel.SB.SpringBootBackend.entity.User;
import com.rebel.SB.SpringBootBackend.repo.UserRepo;
import com.rebel.SB.SpringBootBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepo userRepo;

    //adding new user
    @Override
    public User createUser(User user) {
        User newUser = this.userRepo.save(user);

        return newUser;
    }



}
