package com.gk.employee.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "emp_no")
	private int id;
	@Column(name = "birth_date")
	private Date birthDate;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "hire_date")
	private Date hireDate;
}
