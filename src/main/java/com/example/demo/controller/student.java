package com.example.demo.controller;

import com.example.demo.model.students;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class student {
    @Autowired
    studentService student;

    @GetMapping("/students")
    public List<students> students(){
        return student.allStudents();
    }

    @PostMapping("/students/{rollno}/{name}")
    public void students(@PathVariable int rollno,@PathVariable String name){
        student.student(rollno,name);

    }

    @GetMapping("/students/{name}")
    public students studentbyname(@PathVariable String name){
     return   student.getbyname(name);
    }

@DeleteMapping("/students/{rollno}")
public void delete(@PathVariable int rollno){
        student.deletebyrollno(rollno);
}
}
