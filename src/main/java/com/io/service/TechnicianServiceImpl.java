package com.io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.dao.TechnicianDao;
import com.io.entity.Technician;

@Service
@Transactional
public class TechnicianServiceImpl implements TechnicianService {
	
	@Autowired
	private TechnicianDao dao;

	@Override
	public void addTechnician(Technician tech) {
		// TODO Auto-generated method stub
		dao.addTechnician(tech);
	}

	@Override
	public void updateTechnician(Technician tech) {
		// TODO Auto-generated method stub
		dao.updateTechnician(tech);	
	}

	@Override
	public void deleteTechnician(int techId) {
		// TODO Auto-generated method stub
		dao.deleteTechnician(techId);
	}

}
