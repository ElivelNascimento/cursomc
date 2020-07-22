package com.elivel.nascimento.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elivel.nascimento.cursomc.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
