package com.gk.employee.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gk.employee.entity.DeptManager;

@Repository
public interface DeptManagerRepository extends JpaRepository<DeptManager,Integer>{

}
