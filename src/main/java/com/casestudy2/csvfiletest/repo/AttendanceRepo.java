package com.casestudy2.csvfiletest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.casestudy2.csvfiletest.entity.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

	  @Modifying
	    @Transactional
		@Query(value = "insert into attendance(employee_id,day,is_present) values(?,?,?);", nativeQuery = true)
		void saveAttendance(Long id,Integer day, Boolean isPresent);
	    
}
