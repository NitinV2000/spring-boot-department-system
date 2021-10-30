package com.example.springboottutorial.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.springboottutorial.entity.Department;
import com.example.springboottutorial.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {
	
	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		Department department = Department.builder()
				.departmentName("IT")
				.departmentAddress("Bangalore")
				.departmentCode("IT-06")
				.departmentId(1L)
				.build();
	}

	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String departmentName = "IT";
		Department found = departmentService.fetchDepartmentByName(departmentName);
		assertEquals(departmentName,found.getDepartmentName());
	}
}
