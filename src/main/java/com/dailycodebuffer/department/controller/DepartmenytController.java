package com.dailycodebuffer.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmenytController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/save")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("get/{id}")
	public Department getDepartment(@PathVariable long id) {
		return departmentService.getDepartment(id);
	}

}
