package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.City;
import com.webcore.app.loan.main.model.State;
import com.webcore.app.loan.main.repository.HomeRepository;

@Service
public class ServiceImplementation implements ServiceInterface {
	@Autowired
	HomeRepository hr;

	public void registration(City c) {
		hr.save(c);

	}

	@Override
	public List getAllData() {
		
		return (List) hr.findAll();
		
	}

}
