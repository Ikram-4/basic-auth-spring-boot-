package com.example.demo.repositry;

import com.example.demo.model.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<students,Integer> {

    students findByName(String name);
}
