package com.adhish.spring_sec.dao;

import com.adhish.spring_sec.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
