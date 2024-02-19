package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Transient
    private int age;
    private LocalDate DateofBirth;
    private String email;

    public Student(long id, String name, LocalDate dateofBirth, String email) {
        this.id = id;
        this.name = name;
        DateofBirth = dateofBirth;
        this.email = email;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", DateofBirth=" + DateofBirth + ", email='" + email + '\'' + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {


        return Period.between(this.DateofBirth, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, LocalDate dateofBirth, String email) {
        this.name = name;
        DateofBirth = dateofBirth;
        this.email = email;
    }
}
