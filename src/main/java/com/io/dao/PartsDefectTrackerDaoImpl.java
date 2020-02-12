package com.io.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.io.entity.DefectList;
import com.io.entity.Department;
import com.io.entity.Login;
import com.io.entity.PartList;
import com.io.entity.Technician;
import com.io.exception.LoginException;
import com.io.exception.PartsDefectException;

@Repository
public class PartsDefectTrackerDaoImpl implements PartsDefectTrackerDao {

	@PersistenceContext
	EntityManager em;
	

	@Override
	public void adduser(Login login) {
		
		em.persist(login);
	}

	@Override
	public Login authenticate(Login login) throws LoginException {
		String userName = login.getUsername();
		
		Login founduser = em.find(Login.class, userName);
		if(founduser != null)
		{
			return founduser;
		}
		
		else
			throw new LoginException("Invalid Username!");
	}

	
	@Override
	public List<PartList> getPartList() throws PartsDefectException{
		
		List<PartList> partList = em.createQuery("from PartList").getResultList();
		if(partList != null)
			return partList;
		else
			throw new PartsDefectException("Part List is Empty");
	}

	@Override
	public int validatePartNumber(String itemNumber) throws PartsDefectException{
		
		PartList partList =em.find(PartList.class, itemNumber);
		
		if(partList != null)
			return partList.getPlantNumber();
		else
			throw new PartsDefectException("Part number Does not exist");
	}
	
	@Override
	public int createDefect()throws PartsDefectException {
		int defectNumber = (int) (Math.random()*12345);
		return defectNumber;
	}

	@Override
	public int getDepartmentId(String dptName) throws PartsDefectException{
		
		String qStr = "SELECT dpt FROM Department dpt WHERE dpt.departmentName = :dptName";
		TypedQuery<Department> query = em.createQuery(qStr, Department.class);
		query.setParameter("dptName", dptName);
		Department dpt = query.getSingleResult();
		if(dpt != null)
			return dpt.getDepartmentId();
		else
			throw new PartsDefectException("No Department Found");
	}

	@Override
	public List<String> getTechnicianName(String dptName)throws PartsDefectException {
		
		int dptId=getDepartmentId(dptName);
		
		String qStr = "SELECT Name FROM Technician WHERE dpt_id = :dptId";
		Query query = em.createNativeQuery(qStr);
		query.setParameter("dptId", dptId);
		List<String> tech = query.getResultList();
		if(tech!= null)
			return tech;
		else
			throw new PartsDefectException("Department Name not exist");
	}
	
	@Override
	public List<Department> getDepartmentNames()throws PartsDefectException {
		
		String qStr = "SELECT dpt_Name FROM Department";
		Query query = em.createNativeQuery(qStr);
		List<Department> dptNames = query.getResultList();
		if(dptNames != null)
			return dptNames;
		else
			throw new PartsDefectException("No departments available currently");
		
		
	}

	@Override
	public int addDefect(DefectList defect) throws PartsDefectException {
		if(defect != null)
		{
			em.persist(defect); 
			return defect.getDefectNumber();
		}
		
		else
			throw new PartsDefectException("Invalid defect details");

	}

}
