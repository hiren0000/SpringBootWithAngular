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

    //get all list of users
    @Override
    public List<User> getALlUsers() {

        List<User> users = this.userRepo.findAll();

        return users;
    }

    //getting user by id
    @Override
    public User getById(Integer id)
    {
        User user = this.userRepo.findById(id).get();
        return user;
    }

    //updating user
    @Override
    public User updateUser(User user, Integer id)
    {
        User user1 = this.userRepo.findById(id).get();
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        user1.setEmail(user.getEmail());
        user1.setAbout(user.getAbout());

        //updating user
        User updatedUser = this.userRepo.save(user1);

        return updatedUser;
    }

    //deleting user
    @Override
    public void deleteById(Integer id) {

        User user1 = this.userRepo.findById(id).get();

        this.userRepo.delete(user1);
    }
}
