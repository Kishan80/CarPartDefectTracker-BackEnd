package com.io.dao;

import com.io.entity.Department;

public interface DepartmentDao {

	void addDepartment(Department dpt);
	
	void updateDepartment(Department dpt);
	
	void deleteDepartment(int dptId);
}
