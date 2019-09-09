package com.example.demo.service;

import com.example.demo.model.Persona;

public interface IPersonaService {

	public void registrar(String name);
	
	Persona findByDocumentoAndClave(Integer documento, String clave);
}
