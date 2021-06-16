package com.bron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bron.service.SendEmailService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/sendEmail"})
public class EmailController {
	@Autowired
	SendEmailService service;
	
	@PostMapping("/confirmacionCompra")
	public String enviarCorreoCompra(@RequestBody String to) {
		service.sendEmail(to,"Confirmacion de pedido",
				"Hola " + to + ", hemos confirmado tu compra y estamos preparando tu pedido, esperemos lo disfrutes mucho. Saludos");
		return "email enviado";
	}
	
	@PostMapping("/confirmacionQueja")
	public String enviarCorreoQueja(@RequestBody String to) {
		service.sendEmail(to,"Confirmacion de queja",
				"Hola " + to + ", hemos recibido tu queja y nos pondremos en contacto contigo pronto. Saludos");
		return "email enviado";
	}
}
