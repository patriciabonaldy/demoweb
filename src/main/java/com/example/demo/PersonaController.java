package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@Controller
public class PersonaController {
	
	private static Logger Log = LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	private IPersonaService ipersona;
	
	@GetMapping("/persona")
	public String registrarPersona(Model model) {
		ipersona.registrar("Princeso culito de negra");
		return "registro";
	}
	
	@GetMapping(value = "/persona/{documento}/{clave}")
	public String registrarPersona(@PathVariable("documento") Integer documento,@PathVariable("clave") String clave, 
									ModelMap model,HttpServletRequest request) {
		System.out.println("User documento : " + documento);
		System.out.println("User clave : " + clave);
		
		Persona persona = ipersona.findByDocumentoAndClave(documento, clave);
		model.addAttribute("msg", persona);
		return "registro";
	}

}
