package com.project.cms.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cms.admin.entity.admintable;
import com.project.cms.admin.repository.adminRepos;

@Service
public class adminService {
	@Autowired
	private adminRepos repository;
	
	public admintable setAdmin(admintable obj)
	{
		return repository.save(obj);
	}
	public admintable findAdmin(String email)
	{
		return repository.findByEmail(email);
	}
	public List<admintable> findAlladmin()
	{
		return repository.findAll();
	}
}
