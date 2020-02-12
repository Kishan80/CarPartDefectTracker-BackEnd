package com.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.DefectList;
import com.io.entity.Department;
import com.io.entity.Login;
import com.io.entity.PartList;
import com.io.entity.Technician;
import com.io.exception.LoginException;
import com.io.exception.PartsDefectException;
import com.io.service.PartsDefectTrackerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PartsDefectTrackerController {

	@Autowired
	PartsDefectTrackerService service;
	
	
	@PostMapping(value = "/getlogin", consumes = "application/json")
	public String authenticate(@RequestBody Login login) throws LoginException {
		Login log = service.authenticate(login);
		String pass = log.getPassword();
		
		if (pass.equals(login.getPassword()))
			return "Login Successfull";
		else 
			throw new LoginException("Invalid Password!") ;
	
	}

	@PostMapping(value = "/addUser", consumes = "application/json")
	public String adduser(@RequestBody Login login) {

		service.adduser(login);
		return "User added";
	}
	
	
	
	
	
	
	@GetMapping(value="/createdefect",produces="application/json") //returns defect number
	public int createdefect() throws PartsDefectException{
		return service.createDefect();
	}
	
	@GetMapping(value = "/getPartsList", produces = "application/json") //returns Parts list
	public List<PartList> getPartsList()throws PartsDefectException {
		
		return service.getPartList();

	}
	
	@GetMapping(value = "/validate/{partNumber}", produces = "application/json")  //returns plant number
	public int valiDatePartNumber(@PathVariable String partNumber)throws PartsDefectException {
		
		return service.validatePartNumber(partNumber);

	}
	
	
	@GetMapping(value = "/getDptId", produces = "application/json")  //returns DepartNumber
	public int getDepartmentId(@RequestParam("dptName") String dptName) throws PartsDefectException{
		
		return service.getDepartmentId(dptName);

	}
	
	@GetMapping(value = "/getTechName/{departmentName}", produces = "application/json")  //returns employees
	public List<String> getTechnicianName(@PathVariable String departmentName) throws PartsDefectException{
		
		return service.getTechnicianName(departmentName);

	}
	
	@GetMapping(value = "/getDptNames", produces = "application/json") //returns Parts list
	public List<Department> getDepartmentNames() throws PartsDefectException{
		
		return service.getDepartmentNames();

	}
	
	
	@PostMapping(value = "/addDefect", consumes = "application/json") // postmapping for add
	public int add(@RequestBody DefectList defect) throws PartsDefectException {
		System.out.println(defect);
		return service.addDefect(defect);
	}
	
	
	
}
