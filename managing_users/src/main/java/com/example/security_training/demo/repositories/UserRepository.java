package com.example.security_training.demo.repositories;

import com.example.security_training.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

// don't use @Repository here, it's not needed with interfaces and abstract classes
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String username);
}
