package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;

public interface DepartmentService {

	Department addDepartment(Department department);

	Department getDepartment(long id);


}
