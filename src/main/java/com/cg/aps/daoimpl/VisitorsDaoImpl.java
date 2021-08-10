package com.cg.aps.daoimpl;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.dao.VisitorDAOInt;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.VisitorNotFoundException;
import com.cg.aps.repo.VisitorRepository;

@Service
public class VisitorsDaoImpl implements VisitorDAOInt {
	
	@Autowired
	private VisitorRepository repository;

	@Override
	public void add(VisitorEntity bean) {
		if(repository.existsById(bean.getVisitorId())) {
		 throw new VisitorNotFoundException("Visitor with Id "+bean.getVisitorId()+" already exists");
		}
		else 
			 repository.save(bean);	
	}

	@Override
	public void update(VisitorEntity bean) {
		if(repository.existsById(bean.getVisitorId())) {
			repository.save(bean);
		}
		else
		throw new VisitorNotFoundException("Visitor with Id "+bean.getVisitorId()+" does not exists");
			
	}

	@Override
	public void delete(int visId) {
		if(repository.existsById(visId)) {
			repository.deleteById(visId);
		}
		else
		throw new VisitorNotFoundException("Visitor with Id "+visId+" does not exists");
		
	}

	@Override
	public VisitorEntity findByName(String name) {
		Optional<VisitorEntity> opt = repository.findByName(name);
		VisitorEntity bean = null;
		if (opt.isPresent())
			bean = opt.get();
		return bean;
	}

	@Override
	public VisitorEntity findByPk(int id) {
		Optional<VisitorEntity> opt = repository.findById(id);
		VisitorEntity bean = null;
		if (opt.isPresent())
			bean = opt.get();
		return bean;
	}

	@Override
	public List<VisitorEntity> getAllVisitors() {

		List<VisitorEntity> visitor= repository.findAll();
		return visitor;
	}

	@Override
	public VisitorEntity getVisitor(int id) {
		Optional<VisitorEntity> opt = repository.findById(id);
		VisitorEntity bean = null;
		if (opt.isPresent())
			bean = opt.get();
		return bean;
	}

}
