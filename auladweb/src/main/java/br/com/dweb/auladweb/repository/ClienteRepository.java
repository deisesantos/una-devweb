package br.com.dweb.auladweb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.dweb.auladweb.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	List <Cliente> findByNomeLike(String nome);

}
