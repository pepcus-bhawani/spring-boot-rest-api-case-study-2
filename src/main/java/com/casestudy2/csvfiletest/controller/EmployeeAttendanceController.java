package com.casestudy2.csvfiletest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy2.csvfiletest.entity.Attendance;
import com.casestudy2.csvfiletest.model.EmployeeRespose;
import com.casestudy2.csvfiletest.serviceI.IAttendanceService;



@RestController
public class EmployeeAttendanceController {
	@Autowired
	IAttendanceService attendance;

	@PostMapping("/attendance")
	public ResponseEntity<EmployeeRespose> getAttendace(@RequestBody String str)
	{

		return attendance.addEmployeeAttendance(str);
				
		
	}
	
	@GetMapping("/emp_attendance")
	public List<Attendance> getEmployeeAttendance()
	{
		
		return attendance.getAllEmployeeWithAttendance();
		
	}
	
	
	
	
}
