package org.example.dao;

import org.example.dao.rowmappers.EmployeeRowMapper;
import org.example.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertEmployee(Employee employee) {
        // Code to insert employee details object into database
        /*String sql = "insert into employee values('" +employee.getId()+"' , '"
                +employee.getName()+"' ," +employee.getExp()+")";*/
        String sql = "insert into employee values(?,?,?)";
        System.out.println("QUERY : " +sql);
        jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
    }
    @Override
    public List<Employee> findAllEmployees() {
        // Code to return all employee details object in employee table
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<Employee> employees = jdbcTemplate.query("select * from employee",rowMapper);
        return employees;
    }
    @Override
    public Employee getEmployeeById(String id) {
        // Code to get all employee information based on their id
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject("select * from employee where id = ? ",rowMapper,id);
        return employee;
    }
}
