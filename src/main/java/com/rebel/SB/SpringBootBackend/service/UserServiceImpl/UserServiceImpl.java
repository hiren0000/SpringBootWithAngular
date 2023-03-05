package com.rebel.SB.SpringBootBackend.service.UserServiceImpl;

import com.rebel.SB.SpringBootBackend.entity.User;
import com.rebel.SB.SpringBootBackend.repo.UserRepo;
import com.rebel.SB.SpringBootBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> getALlUsers() {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public User updateUser(User user, Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
