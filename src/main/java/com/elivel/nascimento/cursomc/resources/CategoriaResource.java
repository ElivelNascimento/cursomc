package com.elivel.nascimento.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elivel.nascimento.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() 
	{
		Categoria cat1 = new Categoria(1, "Escritório");
		Categoria cat2 = new Categoria(2, "TI");
		Categoria cat3 = new Categoria(2, "Desenvolvimento");
		Categoria cat4 = new Categoria(2, "Mecânica");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		
		return lista;
	}

}
