package com.cg.aps.dao;

import java.util.List;

import com.cg.aps.entities.FlatRentEntity;



public interface FlatRentDAOInt {

	public long add(FlatRentEntity bean);
	
	public void update(FlatRentEntity bean);
	
	public void delete(FlatRentEntity bean);
	
	public FlatRentEntity findByName(String name);
	
	public FlatRentEntity findByPk(long id);
	
	public List<FlatRentEntity> search(FlatRentEntity bean, long pageNo, int pageSize);
	
	public List<FlatRentEntity> search(FlatRentEntity bean);
	
	
}
