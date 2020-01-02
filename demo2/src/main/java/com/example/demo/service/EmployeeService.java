package com.example.demo.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAllEmployees() {
        return repository.findAllEmployees();
    }

    public Employee findEmployeeById(Integer id) {
        return repository.findEmployeeById(id);
    }

    public List<Employee> deleteEmployee(Long id) {
        repository.deleteById(id);
        return repository.findAllEmployees();
    }
}

