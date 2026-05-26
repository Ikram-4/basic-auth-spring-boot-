package com.example.demo.repositry;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repoUsers extends JpaRepository<Users,Integer> {
    Users findByName(String name);
}
