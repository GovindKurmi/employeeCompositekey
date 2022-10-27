package com.gk.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "departments")
public class Departments {

	@Id
	@Column(name = "dept_no")
	private String deptNo;
	@Column(name = "dept_name")
	private String deptName;

}
