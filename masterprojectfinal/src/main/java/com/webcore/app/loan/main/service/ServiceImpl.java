package com.webcore.app.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BranchType;
import com.webcore.app.loan.main.model.City;
import com.webcore.app.loan.main.model.Status;
import com.webcore.app.loan.main.model.User;
import com.webcore.app.loan.main.repository.HomeRepository;
import com.webcore.app.loan.main.repository.RepositoryAddress;
import com.webcore.app.loan.main.repository.RepositoryBranchType;
import com.webcore.app.loan.main.repository.RepositoryStatus;
import com.webcore.app.loan.main.repository.RepositoryUser;




@Service
public class ServiceImpl implements ServiceI
{
@Autowired
HomeRepository hr;

@Autowired 
RepositoryAddress ra;

@Autowired 
RepositoryUser ru;

@Autowired
RepositoryBranchType rbt;

@Autowired
RepositoryStatus rs1;



	
	@Override
	public void saveBranch(Branch b) {
	
		hr.save(b);
	}
	

	@Override
	public void saveaddress(City c) {
		ra.save(c);
		
		
	}

	@Override
	public void saveUser(User u) {
		ru.save(u);
		
	}

	@Override
	public void savebranchtype(BranchType bt) {
		rbt.save(bt);
		
	}


	@Override
	public void savestatus(Status s) {
		// TODO Auto-generated method stub
		rs1.save(s);
	}
	
	
	

}
