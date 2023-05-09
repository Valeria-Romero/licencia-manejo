package com.codingdojo.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
