package com.cg.aps.daoimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.repository.VisitorDAOInt;

@Service
public class VisitorsDaoImpl implements VisitorDAOInt {
	
	

	@Override
	public long add(VisitorEntity bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(VisitorEntity bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(VisitorEntity bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VisitorEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitorEntity findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VisitorEntity> search(VisitorEntity bean, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VisitorEntity> search(VisitorEntity bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
