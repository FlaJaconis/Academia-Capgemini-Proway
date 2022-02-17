package com.capfla.banco.repository;

import com.capfla.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {
    
}
