package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EmployeeService;
import com.example.demo.model.Employee;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
    static List<Employee> employees = new ArrayList<Employee>();

    static {
        employees.add(new Employee(1L, "branden", "dev"));
        employees.add(new Employee(2L, "xinwin", "dev"));
        employees.add(new Employee(3L, "viet", "manager"));
    }

    @PostMapping("/api/employee")
    public List<Employee> createEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employees;
    }

    @GetMapping("/api/employee")
    public List<Employee> findAllEmployees() {
        return employees;
    }

    @GetMapping("/api/employee/{employeeId}")
    public Employee findEmployeeById(@PathVariable("employeeId") Integer eid) {
        for(Employee e: employees) {
            if(e.getId().equals(eid)) {
                return e;
            }
        }
        return null;
    }
    @PutMapping("/api/employee/{employeeId}")
    public Employee updateEmployee(
        @PathVariable("widgetId") Integer eid,
        @RequestBody Employee employee) {
            return employee;
        }

    @DeleteMapping("/api/employee/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Integer eid) {
        
    }
}

