package com.gk.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.employee.entity.Employee;
import com.gk.employee.entity.Response;
import com.gk.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("emp")
@AllArgsConstructor
public class EmployeeController {
	
	public final EmployeeService employeeService;

	@GetMapping("getemp")
	public List<Employee> getEmp(){
		return employeeService.getEmp();
	}
	
	@GetMapping("empdata/{id}")
	public Response getData(@PathVariable int id){
		return employeeService.getData(id);
	}
}
