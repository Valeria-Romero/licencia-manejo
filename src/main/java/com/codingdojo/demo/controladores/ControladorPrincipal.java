package com.codingdojo.demo.controladores;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.demo.modelos.Persona;
import com.codingdojo.demo.servicios.ServicioLicencias;

@Controller
public class ControladorPrincipal {
	private final ServicioLicencias servicio;
	public ControladorPrincipal(ServicioLicencias servicio) {
		this.servicio = servicio;
	}
	
	@GetMapping("/")
	public String Index() {
		return "index.jsp";
	}
	
	@GetMapping("/nueva")
	public String nuevaPersona(@ModelAttribute("persona") Persona persona) {
		return "nuevaPersona.jsp";		
	}
	
	@PostMapping("/persona")
	public String guardarPersona(@Valid @ModelAttribute("persona") Persona persona, BindingResult result) {
		if(result.hasErrors()) {
			return "nuevaPersona.jsp";
		}
		servicio.guardarPersona(persona);
		return "redirect:/";
	}
}
