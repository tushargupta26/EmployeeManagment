package com.EmployeeManagment.repository;

import com.EmployeeManagment.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
