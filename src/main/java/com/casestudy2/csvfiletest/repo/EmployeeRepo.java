package com.casestudy2.csvfiletest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy2.csvfiletest.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
