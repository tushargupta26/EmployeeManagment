package com.EmployeeManagment.controller;

import com.EmployeeManagment.model.Employee;
import com.EmployeeManagment.service.ViewEmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/employee", headers = "author=Tushar")
public class EmployeeInfo {
    @Autowired
    ViewEmployeeData viewEmployeeData;

    @GetMapping(value = "/printSameData", produces = APPLICATION_JSON_VALUE)
    public Employee returnSameData(@RequestBody Employee employee) {
        return viewEmployeeData.returnSameData(employee);
    }

}
