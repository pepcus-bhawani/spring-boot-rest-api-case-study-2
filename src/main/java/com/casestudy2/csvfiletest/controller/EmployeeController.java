package com.casestudy2.csvfiletest.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.PostPersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.casestudy2.csvfiletest.entity.Employee;
import com.casestudy2.csvfiletest.model.EmployeeRespose;
import com.casestudy2.csvfiletest.serviceI.IEmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<EmployeeRespose> addEmployee(MultipartFile file)
	{
		employeeService.addEmployeeService(file);
		return null;
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmpoyee()
	{
	
		return employeeService.getAllEmployee();
	}

}
