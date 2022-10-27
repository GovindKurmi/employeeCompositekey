package com.gk.employee.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SalariesId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private Date fromDate;
}
