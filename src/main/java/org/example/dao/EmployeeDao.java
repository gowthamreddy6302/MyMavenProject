package org.example.dao;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeDao {
    void insertEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee getEmployeeById(String id);
}
