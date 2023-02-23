package com.project.cms.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.cms.admin.entity.admintable;
import com.project.cms.admin.service.adminService;

@RestController
public class adminController {
	@Autowired
	public adminService service;
	
	@PostMapping("/setadmin")
	public admintable setadmin(@RequestBody admintable obj)
	{
		return service.setAdmin(obj);
	}
	
	@GetMapping("/getadmin/{email}")
	public admintable findadmin(@PathVariable String email)
	{
		return service.findAdmin(email);
	}
	
	@GetMapping("/getAlladmin")
	public List<admintable> findalladmin()
	{
		return service.findAlladmin();
	}
	
	
}
