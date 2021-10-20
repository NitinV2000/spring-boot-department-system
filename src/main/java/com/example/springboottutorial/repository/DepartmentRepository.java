package com.example.springboottutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboottutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	public Department findByDepartmentName(String departmentName);
}
