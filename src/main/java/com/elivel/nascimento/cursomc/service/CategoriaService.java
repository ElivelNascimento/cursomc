package com.elivel.nascimento.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elivel.nascimento.cursomc.domain.Categoria;
import com.elivel.nascimento.cursomc.repositories.CategoriaRepository;
import com.elivel.nascimento.cursomc.service.exeptions.ObjectNotFoundException;

//elivel

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria buscar(Integer id) {
	   Optional<Categoria> obj = repositorio.findById(id);
	   
	   if(obj == null) {
		  throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				  + ", " + Categoria.class.getName());
	   }
	   
		return obj.orElse(null);
	}
	
}
