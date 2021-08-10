package com.cg.aps.dao;

import java.util.List;

import com.cg.aps.entities.VisitorEntity;



public interface VisitorDAOInt {

	public void add(VisitorEntity bean);
	
	public void update(VisitorEntity bean);
	
	public void delete(int visId);
	
	public VisitorEntity getVisitor(int id);
	
	public VisitorEntity findByName(String name);
	
	public VisitorEntity findByPk(int id);
	
	public List<VisitorEntity> getAllVisitors();

	
	
	
}
