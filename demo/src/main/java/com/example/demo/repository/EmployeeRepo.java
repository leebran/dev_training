package com.example.demo.data.jpa.crud.repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.data.jpa.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select employee from Employee employee")
    public List<Employee> findAllEmployees();

    @Query("select employee from Employee employee where employee.id = :uid")
    public Employee findEmployeeById(@Param("uid") Integer id);

    @Query("select employee from Employee employee where employee.name = :name")
    public Employee findEmployeeByName(@Param("name") String name);
}