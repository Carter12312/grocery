package com.example.demo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String email;
    private Long id;
    private Integer age;
    private LocalDate dob;

    public Student() {
    }

    public Student(
            String name,
            String email,
            Long id,
            Integer age,
            LocalDate dob) {

        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
        this.dob = dob;
    }

    public Student(String name, String email, Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String  toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
