package com.project.cms.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cms.admin.entity.admintable;

public interface adminRepos extends JpaRepository<admintable, Integer>{
	admintable findByEmail(String email);
}
