package com.io.dao;

import com.io.entity.Technician;

public interface TechnicianDao {

	void addTechnician(Technician tech);

	void updateTechnician(Technician tech);

	void deleteTechnician(int techId);

}
