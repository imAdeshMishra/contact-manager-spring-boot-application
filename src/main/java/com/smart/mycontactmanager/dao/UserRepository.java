package com.smart.mycontactmanager.dao;

import com.smart.mycontactmanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}
