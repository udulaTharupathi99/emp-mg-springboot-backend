package com.example.springboot_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "age")
    private int age;

    public Employee() {
    }

    public Employee(Long id, int age, String emailId, String name) {
        this.id = id;
        this.age = age;
        this.emailId = emailId;
        this.name = name;
    }


}
