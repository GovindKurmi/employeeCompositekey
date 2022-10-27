package com.gk.employee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gk.employee.entity.DeptEmp;
@Repository
public interface DeptEmpRepository extends JpaRepository<DeptEmp, Integer> {

	@Query("from DeptEmp where id=:id")
	DeptEmp findByDept(@Param("id") int id);

}
