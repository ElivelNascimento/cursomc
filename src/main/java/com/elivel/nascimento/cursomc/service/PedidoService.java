package com.elivel.nascimento.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elivel.nascimento.cursomc.domain.Pedido;
import com.elivel.nascimento.cursomc.repositories.PedidoRepository;
import com.elivel.nascimento.cursomc.service.exeptions.ObjectNotFoundException;


@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repositorio;
	
	public Pedido buscar(Integer id) {
	   Optional<Pedido> obj = repositorio.findById(id);
	   
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
