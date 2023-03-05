package com.EmployeeManagment.controller;

import com.EmployeeManagment.model.Employee;
import com.EmployeeManagment.service.UpdateDatabase;
import com.EmployeeManagment.service.ViewEmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/employee", headers = "author=Tushar")
public class EmployeeInfo {
    @Autowired
    ViewEmployeeData viewEmployeeData;
    @Autowired
    UpdateDatabase updateDatabase;

    @GetMapping(value = "/printSameData", produces = APPLICATION_JSON_VALUE)
    public Employee returnSameData(@RequestBody Employee employee) {
        return viewEmployeeData.returnSameData(employee);
    }

    @PostMapping(value = "/addData", produces = APPLICATION_JSON_VALUE)
    public String addEmployee(@RequestBody Employee employee) {
        String employeeId = updateDatabase.saveNewRecord(employee);
        return employeeId;
    }

}
