package com.cg.aps.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.service.VisitorServiceInt;



@RestController
@RequestMapping("visitors")
public class VisitorController {

	@Autowired
	VisitorServiceInt service;
	
	@GetMapping
	public List<VisitorEntity> getAllVisitors() {
		return service.getAllVisitors();
	}


	@PostMapping
	public ResponseEntity<String> add(@Valid @RequestBody VisitorEntity bean) {

		service.add(bean);

		return new ResponseEntity<String>("Visitor with id " + bean.getVisitorId() + " saved successfully",
				HttpStatus.CREATED);
	}

	
	@PutMapping
	public ResponseEntity<String> update(@Valid @RequestBody VisitorEntity ve) {

		
			service.update(ve);
			return new ResponseEntity<String>("Visitor with id " + ve.getVisitorId() + " updated successfully",
					HttpStatus.CREATED);
	
	}
	
	@DeleteMapping("{vid}")
	public ResponseEntity<String> delete(  @PathVariable("vid") int visId) {

	
			service.delete(visId);
			return new ResponseEntity<String>("Visitor with id " + visId + " deletedsuccessfully",	HttpStatus.OK);
		
	}
	@GetMapping("/visitorName/{name}")
	public ResponseEntity<?> findByName(@PathVariable("name") String name){
		VisitorEntity ve = service.findByName(name);
		if(ve!=null) {
			return new ResponseEntity<VisitorEntity>(ve,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Visitor with name " +name+ " not found",HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@GetMapping("/visitorId/{id}")
	public ResponseEntity<?> getVisitor(@PathVariable("id") int id){
		VisitorEntity v = service.getVisitor(id);
		if(v!=null) {
			return new ResponseEntity<VisitorEntity>(v,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Visitor with id " +id+ " not found",HttpStatus.NOT_FOUND);
		}
	}
}
