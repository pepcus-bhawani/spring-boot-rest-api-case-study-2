package com.casestudy2.csvfiletest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
    @Id
    @GeneratedValue(generator = "abc")
    @GenericGenerator(name = "abc",strategy = "increment")
	private Long empId;
	
	@NotBlank(message = "name can't be empty")
	private String name;
	
	@NotBlank(message = "city can't be  empty")
	private String city;
	
    
	@Email(message = "please provide vailid email")
    private String email;
    
	
    private Department department;
    
}
