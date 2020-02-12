package com.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.Department;
import com.io.service.DepartmentService;

@RestController
public class DepartmentListController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping(value = "/add", consumes = "application/json")   //postmapping for add
	public String add(@RequestBody Department d) {
		service.addDepartment(d);
		return "Department Saved!";
	}
		
    @PutMapping(value= "/update" , consumes = "application/json")
    public String update(@RequestBody Department dp) {
    	service.updateDepartment(dp);
		return "Updated successfully";
    	
    }
    
    @DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int dptId) {
		service.deleteDepartment(dptId);
		return "Department Deleted";
	}
	
}
