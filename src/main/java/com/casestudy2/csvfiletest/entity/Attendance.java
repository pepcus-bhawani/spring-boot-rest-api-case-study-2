package com.casestudy2.csvfiletest.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Attendance {
    @Id
	@GeneratedValue(generator = "abc")
    @GenericGenerator(name = "abc",strategy = "increment")
	private Long id;
	@Max(31)
	@NotNull(message = "Please Provide Value For Day")
	private Integer day;
	
	@NotNull(message = "Please Provide Value For Day")
	Boolean isPresent;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_Id", referencedColumnName = "empId")
	private Employee employee;
	
	
	
}
