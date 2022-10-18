package com.casestudy2.csvfiletest.service;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.casestudy2.csvfiletest.entity.Department;
import com.casestudy2.csvfiletest.entity.Employee;
import com.casestudy2.csvfiletest.model.EmployeeRespose;
import com.casestudy2.csvfiletest.repo.EmployeeRepo;
import com.casestudy2.csvfiletest.serviceI.IEmployeeService;

import lombok.extern.log4j.Log4j2;
@Log4j2
@Component
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public ResponseEntity<EmployeeRespose> addEmployeeService(MultipartFile file) {

		List<Employee> employeeList = new ArrayList<>();
	

		try {

			String arr[] = new String(file.getBytes()).split("\n");
			
			for (int i = 0; i < arr.length ; i++) {
				String empArray[] = arr[i].split(",");
				
				Employee employee = new Employee();

				employee.setName(empArray[0]);
				employee.setCity(empArray[1]);
				employee.setEmail(empArray[2]);
				employee.setDepartment(Department.findByLabel(empArray[3].trim()));
				employeeList.add(employee);
				

			}


			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    log.info("Start");
		repo.saveAll(employeeList);
		log.info("END");

		return null;
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}

}
