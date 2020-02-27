package com.webcore.app.ms.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.ms.main.model.BranchType;
import com.webcore.app.ms.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI
{
	@Autowired
	HomeRepository repo;

	@Override
	public void saveData(BranchType bt)
	{
		repo.save(bt);
	}
}
