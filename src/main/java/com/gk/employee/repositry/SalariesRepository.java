package com.gk.employee.repositry;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gk.employee.entity.Salaries;
@Repository
public interface SalariesRepository extends JpaRepository<Salaries, Integer> {

	@Query("from Salaries where id=:id and fromDate=:date")
	Salaries findBySalary(@Param("id") int id,@Param("date") Date date);

}
