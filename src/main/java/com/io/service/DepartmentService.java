package com.io.service;

import com.io.entity.Department;

public interface DepartmentService {

	void addDepartment(Department dpt);

	void updateDepartment(Department dpt);

	void deleteDepartment(int dptId);
}
