package com.gk.employee.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	private String name;

	private Date bdata;

	private String department;

	private String title;

	private int salary;
}
