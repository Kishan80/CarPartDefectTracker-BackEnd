package com.io.service;

import com.io.entity.Technician;

public interface TechnicianService {

	void addTechnician(Technician tech);

	void updateTechnician(Technician tech);

	void deleteTechnician(int techId);
}
