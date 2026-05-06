package com.project.taskmanager.repository;

import com.project.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find a user for login
    Optional<User> findByUsername(String username);
    
    // Custom query to check if a username is taken during signup
    Boolean existsByUsername(String username);
}