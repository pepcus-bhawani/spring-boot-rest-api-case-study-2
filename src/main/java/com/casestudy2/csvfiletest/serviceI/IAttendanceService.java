package com.casestudy2.csvfiletest.serviceI;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.casestudy2.csvfiletest.entity.Attendance;
import com.casestudy2.csvfiletest.entity.Employee;
import com.casestudy2.csvfiletest.model.EmployeeRespose;

public interface IAttendanceService {
	
	public ResponseEntity<EmployeeRespose>  addEmployeeAttendance(String str) ;
	
	public List<Attendance> getAllEmployeeWithAttendance() ;

}
