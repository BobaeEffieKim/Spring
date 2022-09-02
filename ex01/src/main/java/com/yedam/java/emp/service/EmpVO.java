package com.yedam.java.emp.service;

import lombok.Data;

@Data
public class EmpVO {
	
	String employeeId;	//employee_id로 변환해줌
	String firstName;
	String lastName;
	String email;
	String hireDate;
	String jobId;
	String salary;
	
}
