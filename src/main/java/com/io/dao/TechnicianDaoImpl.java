package com.io.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.io.entity.Technician;

@Repository
public class TechnicianDaoImpl implements TechnicianDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addTechnician(Technician tech) {
		// TODO Auto-generated method stub
		em.persist(tech);
	}

	@Override
	public void updateTechnician(Technician tech) {
		// TODO Auto-generated method stub
		em.merge(tech);
	}

	@Override
	public void deleteTechnician(int techId) {
		// TODO Auto-generated method stub
		Technician tec = em.find(Technician.class, techId);
		em.remove(tec);
	}
}
