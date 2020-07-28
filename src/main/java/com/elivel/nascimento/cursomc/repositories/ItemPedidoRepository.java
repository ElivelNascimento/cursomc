package com.elivel.nascimento.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elivel.nascimento.cursomc.domain.ItemPedido;


@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
