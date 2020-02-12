package com.io.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.io.entity.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addDepartment(Department dpt) {
		// TODO Auto-generated method stub
		
		em.persist(dpt);
	}

	@Override
	public void updateDepartment(Department dpt) {
		// TODO Auto-generated method stub
		em.merge(dpt);
	}

	@Override
	public void deleteDepartment(int dptId) {
		// TODO Auto-generated method stub
		Department dept = em.find(Department.class, dptId);
		em.remove(dept);
	}

}
