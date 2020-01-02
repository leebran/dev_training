package com.example.demo.data.jpa.crud.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.data.jpa.crud.service.EmployeeService;
import com.demo.data.jpa.crud.entity.Employee;

@RestController
@CrossOrigin(origins = "*")
public class EmplyeeController {
    static List<Employee> employees = new ArrayList<Employee>();
    static {
        employees.add(new Employee(1, "branden", "dev"));
        employees.add(new Employee(2, "xinwin", "dev"));
        employees.add(new Employee(3, "viet", "manager"));
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

    @GetMapping("/api/employee/{employeeId") 
    Public Employee findEmployeeById(@PathVariable("employeeId") Integer eid) {
        for(Employee e: employees) {
            if(e.getId().equals(eid)) {
                return e;
            }
        }
    }
    @PutMapping("/api/employee/{employeeId}")
    public Employee updateEmployee(
        @PathVariable("widgetId") Integer eid,
        @RequestBody Employee employee) {
            return employee;
        }
    )

    @DeleteMapping("/api/employee/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Integer eid) {
        
    }

