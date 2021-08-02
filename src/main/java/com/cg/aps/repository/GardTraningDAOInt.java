package com.cg.aps.repository;

import java.util.List;

import com.cg.aps.entities.GardsTranningEntity;



public interface GardTraningDAOInt {

	public long add(GardsTranningEntity bean);
	
	public void update(GardsTranningEntity bean);
	
	public void delete(GardsTranningEntity bean);
	
	public GardsTranningEntity findByName(String name);
	
	public GardsTranningEntity findByPk(long id);
	
	public List<GardsTranningEntity> search(GardsTranningEntity bean, long pageNo, int pageSize);
	
	public List<GardsTranningEntity> search(GardsTranningEntity bean);
	
	
}
