package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int rollno;

    @Column
    private String name;

    public students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public students(Long id, int rollno, String name) {
        this.id = id;
        this.rollno = rollno;
        this.name = name;
    }

    public students() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
