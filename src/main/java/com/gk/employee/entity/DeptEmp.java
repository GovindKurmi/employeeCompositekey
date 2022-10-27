package com.gk.employee.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dept_emp")
@IdClass(DeptEmpId.class)
public class DeptEmp {

	@Id
	@Column(name = "emp_no")
	private int id;
	@Id
	@Column(name = "dept_no")
	private String deptNo;
	@Column(name = "from_date")
	private Date fromDate;
	@Column(name = "to_date")
	private Date toDate;
}
