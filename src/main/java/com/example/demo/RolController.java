package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Rol;
import com.example.demo.service.RolService;

@Controller
public class RolController {
	
	private static Logger Log = LoggerFactory.getLogger(RolController.class);
	
	@Autowired
	private RolService rolService;
	
	@GetMapping("/rol")
	public String registrarPersona(Model model) {
		List<Rol> roles = rolService.getListRoles();
		String name = roles.stream().map(rol -> rol.getDescripcion())
				.collect(Collectors.joining("Rol: ", "<< ", " >>"));
		model.addAttribute("msg", name);
		return "rol";
	}
	
	@GetMapping(value = "/rol/{alias}")
	public String registrarPersona(@PathVariable("alias") String alias, 
									ModelMap model,HttpServletRequest request) {
		
		Rol rol = rolService.findByAlias(alias);
		model.addAttribute("msg", rol);
		return "registro";
	}

}
