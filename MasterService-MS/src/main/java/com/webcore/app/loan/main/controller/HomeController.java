package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.City;
import com.webcore.app.loan.main.model.State;
import com.webcore.app.loan.main.service.ServiceInterface;
@CrossOrigin("http://localhost:4200")
@RestController
public class HomeController {
	@Autowired
	ServiceInterface sr;

	@PostMapping("/reg")
	public City city(@RequestBody City c) {
		
		sr.registration(c);
		return c;
	}
	@GetMapping("/get")
	public List getdata()
	{  List list = sr.getAllData();
		return list;
		
		
	}

}
