package com.io.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.dao.PartListDAO;
import com.io.entity.PartList;

@Service
@Transactional
public class PartListServiceImpl implements PartListService {

	@Autowired
	private PartListDAO dao;
	@Override
	public void createPart(PartList pl) {
		// TODO Auto-generated method stub
		dao.createPart(pl);
	}

}
