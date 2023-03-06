package com.EmployeeManagment;

import com.EmployeeManagment.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagmentApplication {

	@Autowired
	private EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception{
//		employeeDao.createTable();
//	}

}
