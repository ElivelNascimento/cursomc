package com.elivel.nascimento.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elivel.nascimento.cursomc.domain.Cliente;
import com.elivel.nascimento.cursomc.repositories.ClienteRepository;
import com.elivel.nascimento.cursomc.service.exeptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repositorio;
	
	public Cliente buscar(Integer id) {
	   Optional<Cliente> obj = repositorio.findById(id);
	   
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
