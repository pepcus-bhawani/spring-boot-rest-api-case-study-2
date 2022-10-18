package com.casestudy2.csvfiletest.serviceI;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.casestudy2.csvfiletest.entity.Employee;
import com.casestudy2.csvfiletest.model.EmployeeRespose;

public interface IEmployeeService {
	
	public ResponseEntity<EmployeeRespose> addEmployeeService(MultipartFile file);
	public List<Employee> getAllEmployee();

}
