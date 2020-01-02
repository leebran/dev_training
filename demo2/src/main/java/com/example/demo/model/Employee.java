package com.example.demo.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

  public @Id @GeneratedValue Long id;
  public String name;
  public String role;

  Employee() {}

  public Employee(Long id, String name, String role) {
    this.id = id;
    this.name = name;
    this.role = role;
  }

  public Integer getId() {
    return this.id.intValue();
  }
}