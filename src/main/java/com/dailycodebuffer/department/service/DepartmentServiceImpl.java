package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepo departmentRepo;

	public Department addDepartment(Department department) {
		log.info("Inside addDepartment");
		return departmentRepo.save(department);
	}

	public Department getDepartment(long id) {
		return departmentRepo.findById(id).get();
	}



}
