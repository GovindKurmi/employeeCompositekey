package com.gk.employee.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gk.employee.entity.Departments;
import com.gk.employee.entity.DeptEmp;
import com.gk.employee.entity.Employee;
import com.gk.employee.entity.Response;
import com.gk.employee.entity.Salaries;
import com.gk.employee.entity.Titles;
import com.gk.employee.repositry.DepartmentRepository;
import com.gk.employee.repositry.DeptEmpRepository;
import com.gk.employee.repositry.EmployeeRepository;
import com.gk.employee.repositry.SalariesRepository;
import com.gk.employee.repositry.TiltleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	private final SalariesRepository salariesRepository;

	private final DepartmentRepository departmentRepository;

	private final DeptEmpRepository deptEmpRepository;

	private final TiltleRepository tiltleRepository;

	public List<Employee> getEmp() {
		return employeeRepository.findAll().stream().limit(10).toList();
	}

	public Response getData(int id) {
		Response response = new Response();
		String str = "1986-06-26";
		Date date = Date.valueOf(str);
		Optional<Employee> emp = employeeRepository.findById(id);
		Salaries salaries = salariesRepository.findBySalary(id, date);

		DeptEmp deptEmp = deptEmpRepository.findByDept(id);
		Departments dept = departmentRepository.findByDept(deptEmp.getDeptNo());
		Titles titles = tiltleRepository.findEmpId(id);
		if (emp.isPresent()) {
			Employee e = emp.get();
			response.setName(e.getFirstName());
			response.setBdata(e.getBirthDate());
		}

		response.setSalary(salaries.getSalary());
		response.setDepartment(dept.getDeptName());
		response.setTitle(titles.getTitle());

		return response;
	}

}
