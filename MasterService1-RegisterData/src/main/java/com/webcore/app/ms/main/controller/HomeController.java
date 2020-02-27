package com.webcore.app.ms.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.ms.main.model.BranchType;
import com.webcore.app.ms.main.model.City;
import com.webcore.app.ms.main.service.ServiceI;

@RestController
public class HomeController
{
	@Autowired
	ServiceI csi;
	
	@RequestMapping("/reg")
	public BranchType registerData(@RequestBody BranchType bt)
	{
		System.out.println("Branch Type Register Data");
		csi.saveData(bt);
		
		return bt;
	}
	
	/*
	 * @RequestMapping("/cityreg") public City registerData(@RequestBody City c) {
	 * System.out.println("City Register Data"); csi.saveData(c); return c; }
	 */
}
