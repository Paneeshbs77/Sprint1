package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import com.cg.aps.dao.VisitorDAOInt;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.VisitorNotFoundException;
import com.cg.aps.service.VisitorServiceInt;
import com.cg.aps.serviceimpl.VisitorServiceImpl;


class VisitorEntityTest1 {
	
	VisitorDAOInt dao=Mockito.mock(VisitorDAOInt.class);
	VisitorServiceInt service=new VisitorServiceImpl(dao);
	@Test
	public void testGetVisitorById() {
		VisitorEntity ve=new VisitorEntity(1,"Pani","Paneesh","111",LocalDate.of(2021, 06, 25),"11:45AM","1:30PM");
		when(dao.getVisitor(1)).thenReturn(ve);
		VisitorEntity v=service.getVisitor(1);
		String name=v.getName();
		assertEquals("Pani",name);
	}
	
	@Test
	public void testGetVisitorByName() {
		VisitorEntity ve=new VisitorEntity(1,"Pani","Paneesh","111",LocalDate.of(2021, 06, 25),"11:45AM","1:30PM");
		when(dao.findByName("Pani")).thenReturn(ve);
		
		VisitorEntity v=service.findByName("Pani");
		String name=v.getOwnerName();
		assertEquals("Paneesh", name);
		
	}
	@Test
	public void deleteVisitor() {
		try {
			service.delete(1);
			when(dao.getVisitor(1)).thenReturn(null);
			
			VisitorEntity ve=service.getVisitor(1);
			assertNull(ve);
			
		}
		catch(VisitorNotFoundException vne) {
			fail("Delete not working properly");
		}
	}
}
