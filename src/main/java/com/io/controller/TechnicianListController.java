package com.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.Technician;
import com.io.service.TechnicianService;

@RestController
public class TechnicianListController {

	@Autowired
	private TechnicianService service;
	
	@PostMapping(value = "/addTech", consumes = "application/json")   //postmapping for add
	public String add(@RequestBody Technician tech) {
		service.addTechnician(tech);
		return "Technician Saved!";
	}
		
    @PutMapping(value= "/updateTech" , consumes = "application/json")
    public String update(@RequestBody Technician tech) {
    	service.updateTechnician(tech);
		return "Updated successfully";
    	
    }
    
    @DeleteMapping(value="/deleteTech/{id}")
	public String delete(@PathVariable int techId) {
		service.deleteTechnician(techId);
		return "Technician Deleted";
	}
}
