package com.cg.aps.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.dao.VisitorDAOInt;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.service.VisitorServiceInt;


@Service
public class VisitorServiceImpl implements VisitorServiceInt {

	@Autowired
	VisitorDAOInt dao;
	public VisitorServiceImpl() {
		
	}

	public VisitorServiceImpl(VisitorDAOInt dao) {
	this.dao=dao;
	}


	@Override
	public void add(VisitorEntity bean) {

		 dao.add(bean);
	}

	@Override
	public void update(VisitorEntity bean) {

		dao.update(bean);
	}

	@Override
	public void delete(int visId) {

		dao.delete(visId);
	}

	@Override
	public VisitorEntity findByName(String name) {

		return dao.findByName(name);
	}

	@Override
	public VisitorEntity findByPk(int id) {

		return dao.findByPk(id);
	}

	@Override
	public List<VisitorEntity> getAllVisitors() {

		return dao.getAllVisitors();
	}

	@Override
	public VisitorEntity getVisitor(int id) {
		
		return dao.getVisitor(id);
	}

}
