package com.io.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.dao.PartsDefectTrackerDao;
import com.io.entity.DefectList;
import com.io.entity.Department;
import com.io.entity.Login;
import com.io.entity.PartList;
import com.io.entity.Technician;
import com.io.exception.LoginException;
import com.io.exception.PartsDefectException;

@Service
@Transactional
public class PartsDefectTrackerServiceImpl implements PartsDefectTrackerService {
	
	@Autowired
	PartsDefectTrackerDao dao;
	
	
	@Override
	public void adduser(Login login) {
		dao.adduser(login);
		
	}


	@Override
	public Login authenticate(Login login) throws LoginException {
		return dao.authenticate(login);
	}
	
	

	@Override
	public List<PartList> getPartList() throws PartsDefectException{

		
		return dao.getPartList();
	}


	@Override
	public int validatePartNumber(String itemNumber) throws PartsDefectException{
		// TODO Auto-generated method stub
		return dao.validatePartNumber(itemNumber);
	}


	@Override
	public int createDefect() throws PartsDefectException{
		// TODO Auto-generated method stub
		 return dao.createDefect();

	}


	@Override
	public int getDepartmentId(String dptName) throws PartsDefectException{
		// TODO Auto-generated method stub
		return dao.getDepartmentId(dptName);
	}


	@Override
	public List<String> getTechnicianName(String dptName)throws PartsDefectException {
		// TODO Auto-generated method stub
		return dao.getTechnicianName(dptName);
	}


	@Override
	public List<Department> getDepartmentNames()throws PartsDefectException {
		// TODO Auto-generated method stub
		return dao.getDepartmentNames();
	}


	@Override
	public int addDefect(DefectList defect) throws PartsDefectException {
		return dao.addDefect(defect);
	}



	
	
	


}
