package org.example.business;

import org.example.dto.Employee;

public interface EmployeeBusiness {
    void printEmployeeHikes();
    void insertEmployee(Employee employee);
    Employee getEmployeeById(String id);
}
