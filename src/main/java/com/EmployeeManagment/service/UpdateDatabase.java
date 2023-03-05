package com.EmployeeManagment.service;

import com.EmployeeManagment.model.Employee;
import com.EmployeeManagment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDatabase {

    @Autowired
    EmployeeRepository employeeRepository;
    public String saveNewRecord(Employee employee) {
        employeeRepository.save(employee);
        return employee.getEmpId();
    }
}
