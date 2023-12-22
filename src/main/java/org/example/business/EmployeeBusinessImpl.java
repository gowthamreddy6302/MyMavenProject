package org.example.business;

import org.example.dao.EmployeeDao;
import org.example.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("employeeBusiness")
public class EmployeeBusinessImpl implements EmployeeBusiness {
    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void printEmployeeHikes() {
        // Ask using Dao to do an operation for the employees-Hike()

        List<Employee> employees = employeeDao.findAllEmployees();

        // Check each and every employee table and print hikes()

        if (employees != null) {
            for (Employee employee : employees) {
                if (employee.getExp() >= 15) {
                    System.out.println("EMPLOYEE-ID : " + employee.getId() + " - EMPLOYEE-NAME : " + employee.getName() +
                            " - EMPLOYEE-EXPERIENCE : " + employee.getExp() + " GOT 30% HIKE OF SALARY");
                } else if (employee.getExp() >= 10) {
                    System.out.println("EMPLOYEE-ID : " + employee.getId() + " - EMPLOYEE-NAME : " + employee.getName() +
                            " - EMPLOYEE-EXPERIENCE : " + employee.getExp() + " GOT 25% HIKE OF SALARY");
                } else if (employee.getExp() >= 5) {
                    System.out.println("EMPLOYEE-ID : " + employee.getId() + " - EMPLOYEE-NAME : " + employee.getName() +
                            " - EMPLOYEE-EXPERIENCE : " + employee.getExp() + " GOT 20% HIKE OF SALARY");
                } else {
                    System.out.println("EMPLOYEE-ID : " + employee.getId() + " - EMPLOYEE-NAME : " + employee.getName() +
                            " - EMPLOYEE-EXPERIENCE : " + employee.getExp() + " GOT 15% HIKE OF SALARY");
                }
            }
        }
    }
    @Override
    public void insertEmployee(Employee employee) {

        employeeDao.insertEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(String id) {

        return employeeDao.getEmployeeById(id);
    }
}
