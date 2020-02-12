package com.io.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.io.entity.PartList;

@Repository
public class PartListDAOImpl implements PartListDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void createPart(PartList pl) {
		// TODO Auto-generated method stub
		em.persist(pl);
	}

}
