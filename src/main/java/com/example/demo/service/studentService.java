package com.example.demo.service;

import com.example.demo.model.students;
import com.example.demo.repositry.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class studentService {

@Autowired
repo r;
    public List<students> allStudents() {
        return r.findAll();
    }

    public void student(int rollno, String name) {
        students s = new students(rollno,name);


        r.save(s);
    }

    public students getbyname(String name) {
        return r.findByName(name);
    }

    public void deletebyrollno(int rollno) {
        r.deleteAllById(Collections.singleton(rollno));
    }
}
