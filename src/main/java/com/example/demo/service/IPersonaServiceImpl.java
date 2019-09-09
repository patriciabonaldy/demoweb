package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;


@Service
public class IPersonaServiceImpl implements IPersonaService {
	private static Logger Log = LoggerFactory.getLogger(IPersonaServiceImpl.class);
	
	@Autowired
	private PersonaRepository personaRepo;

	@Override
	public void registrar(String name) {
		// TODO Auto-generated method stub,
		Log.info(name);
	}

	@Override
	public Persona findByDocumentoAndClave(Integer documento, String clave) {
		// TODO Auto-generated method stub
		return personaRepo.findByDocumentoAndClave(documento,clave);
	}

}
