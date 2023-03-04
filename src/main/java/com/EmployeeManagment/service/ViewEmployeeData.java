package com.EmployeeManagment.service;

import com.EmployeeManagment.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class ViewEmployeeData {

    public Employee returnSameData(Employee employee) {
        return employee;
    }
}
