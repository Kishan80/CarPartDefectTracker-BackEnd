package com.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.PartList;
import com.io.service.PartListService;

@RestController
public class PartListController {
	@Autowired
	private PartListService service;

	@PostMapping(value = "/addPartList", consumes = "application/json") // postmapping for add
	public String add(@RequestBody PartList pl) {
		service.createPart(pl);
		return "Part Saved!";

	}

}
