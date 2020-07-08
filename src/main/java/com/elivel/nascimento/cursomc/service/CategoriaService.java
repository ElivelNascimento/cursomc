package com.elivel.nascimento.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elivel.nascimento.cursomc.domain.Categoria;
import com.elivel.nascimento.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repositorio.getOne(id);
		
		return obj;
	}
	
}
