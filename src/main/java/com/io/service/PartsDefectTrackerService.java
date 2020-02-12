package com.io.service;

import java.util.List;

import com.io.entity.DefectList;
import com.io.entity.Department;
import com.io.entity.Login;
import com.io.entity.PartList;
import com.io.entity.Technician;
import com.io.exception.LoginException;
import com.io.exception.PartsDefectException;

public interface PartsDefectTrackerService {
	
	public void adduser(Login login);
	
	public Login authenticate(Login login) throws LoginException;
	

	List<PartList> getPartList()throws PartsDefectException;

	int validatePartNumber(String itemNumber)throws PartsDefectException;

	int createDefect()throws PartsDefectException;
	
	int getDepartmentId(String dptName)throws PartsDefectException;
	
	List<String> getTechnicianName(String dptName)throws PartsDefectException;
	
	List<Department> getDepartmentNames()throws PartsDefectException;
	
	int addDefect(DefectList defect) throws PartsDefectException;

}
