package com.cg.aps.repository;

import java.util.List;

import com.cg.aps.entities.GardShiftEntity;



public interface GardShiftDAOInt {

	public long add(GardShiftEntity bean);
	
	public void update(GardShiftEntity bean);
	
	public void delete(GardShiftEntity bean);
	
	public GardShiftEntity findByName(String name);
	
	public GardShiftEntity findByPk(long id);
	
	public List<GardShiftEntity> search(GardShiftEntity bean, long pageNo, int pageSize);
	
	public List<GardShiftEntity> search(GardShiftEntity bean);
	
	
}
