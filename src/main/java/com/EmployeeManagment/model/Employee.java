package com.EmployeeManagment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
@Entity
@Table (name = "Employee")
public class Employee {
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Id
    @Column
    public String empId;
    @Column
    public int age;
}
