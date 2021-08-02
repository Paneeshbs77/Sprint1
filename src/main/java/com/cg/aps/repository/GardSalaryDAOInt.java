package com.cg.aps.repository;

import java.util.List;

import com.cg.aps.entities.GardSalaryEntity;



public interface GardSalaryDAOInt {

	public long add(GardSalaryEntity bean);
	
	public void update(GardSalaryEntity bean);
	
	public void delete(GardSalaryEntity bean);
	
	public GardSalaryEntity findByName(String name);
	
	public GardSalaryEntity findByPk(long id);
	
	public List<GardSalaryEntity> search(GardSalaryEntity bean, long pageNo, int pageSize);
	
	public List<GardSalaryEntity> search(GardSalaryEntity bean);
	
	
}
