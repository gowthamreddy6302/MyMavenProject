package org.example.dao.rowmappers;

import org.example.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getString(1));
        employee.setName(rs.getString(2));
        employee.setExp(rs.getInt(3));
        return employee;
    }
}
