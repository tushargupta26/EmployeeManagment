package com.EmployeeManagment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable() {
        var query = "CREATE TABLE EMPLOYEE(empId varchar(255) PRIMARY KEY, firstName varchar(255) NOT NULL, lastName varchar(255) NOT NULL, age SMALLINT)";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }
}
