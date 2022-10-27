package com.gk.employee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gk.employee.entity.Departments;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Integer> {

	@Query("from Departments where deptNo=:deptNo")
	Departments findByDept(@Param("deptNo") String deptNo);

}
