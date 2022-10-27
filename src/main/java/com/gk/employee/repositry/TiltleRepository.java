package com.gk.employee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gk.employee.entity.Titles;
@Repository
public interface TiltleRepository extends JpaRepository<Titles,Integer>{

	@Query("from Titles where id=:id")
	Titles findEmpId(@Param("id") int id);

}
