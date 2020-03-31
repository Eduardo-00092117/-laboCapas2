package com.uca.capas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {

		return "mostrarLogin";
	}
	
	//Usuario: admin
	//Contraseña: 123
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		String form;
		if(usuario.getUser().equals("admin") && usuario.getPassword().equals("123")) {
			form = "MostrarMensajeV";
		} else {
			form = "MostrarMensajeF";
		}
		return form;
	}
	
}
