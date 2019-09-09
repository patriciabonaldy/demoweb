package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Rol;
import com.example.demo.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public Rol findByAlias(String alias) {
		// TODO Auto-generated method stub
		return rolRepository.findByAlias(alias);
	}

	@Override
	public List<Rol> getListRoles() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
