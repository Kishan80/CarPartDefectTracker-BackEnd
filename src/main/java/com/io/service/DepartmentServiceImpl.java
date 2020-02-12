package com.io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.dao.DepartmentDao;
import com.io.entity.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao dao;

	@Override
	public void addDepartment(Department dpt) {
		// TODO Auto-generated method stub
		dao.addDepartment(dpt);
	}

	@Override
	public void updateDepartment(Department dpt) {
		// TODO Auto-generated method stub
		dao.updateDepartment(dpt);
	}

	@Override
	public void deleteDepartment(int dptId) {
		// TODO Auto-generated method stub
		dao.deleteDepartment(dptId);
	}
}
