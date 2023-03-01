package com.rebel.SB.SpringBootBackend.repo;

import com.rebel.SB.SpringBootBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{

}
