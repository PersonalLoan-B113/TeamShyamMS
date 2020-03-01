package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BranchType;
import com.webcore.app.loan.main.model.City;
import com.webcore.app.loan.main.model.Status;
import com.webcore.app.loan.main.model.User;
import com.webcore.app.loan.main.service.ServiceI;



@CrossOrigin("*")
@RestController
public class HomeController {
	
	@Autowired
	ServiceI si;
	
	@PostMapping("/reg-branch")
	public Branch  savebranch(@RequestBody Branch b) {
		
		si.saveBranch(b);
		return b;
		
	}
	
	@PostMapping("/reg-address")
	public City savecity(@RequestBody City c) {
		
		si.saveaddress(c);
		return c;
	}
	
	@PostMapping("/reg-user")
	public User saveuser(@RequestBody User u) {
		
		si.saveUser(u);
		return u;
	}
	
	@PostMapping("/reg-branchtype")
	public BranchType savebranchtype(@RequestBody BranchType bt) {
		si.savebranchtype(bt);
		return bt;
		
	}
	
	@PostMapping("/reg-status")
	public Status savestatus(@RequestBody Status s) {
	  si.savestatus(s);
	  return s;
	}

}
