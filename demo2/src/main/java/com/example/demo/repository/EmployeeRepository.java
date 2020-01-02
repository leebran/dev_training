package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select employee from Employee employee")
    public List<Employee> findAllEmployees();

    @Query("select employee from Employee employee where employee.id = :uid")
    public Employee findEmployeeById(@Param("uid") Integer id);

    @Query("select employee from Employee employee where employee.name = :name")
    public Employee findEmployeeByName(@Param("name") String name);
}