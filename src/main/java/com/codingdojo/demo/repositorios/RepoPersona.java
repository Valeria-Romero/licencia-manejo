package com.codingdojo.demo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.demo.modelos.Persona;

@Repository
public interface RepoPersona extends CrudRepository<Persona, Long>{
	
}
