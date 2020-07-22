package com.elivel.nascimento.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elivel.nascimento.cursomc.domain.Cliente;
import com.elivel.nascimento.cursomc.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	/*
	@RequestMapping(method=RequestMethod.GET)
	public String Teste() {
		return "ksjdfjkdgh jfkdgh jkdfgh jksdfhjkg  ";
	}
	*/
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/{id}"
			+ "", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok(obj);
		
	}

	
}
