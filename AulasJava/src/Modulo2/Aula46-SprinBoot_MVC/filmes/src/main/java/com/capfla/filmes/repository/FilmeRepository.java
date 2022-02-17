package com.capfla.filmes.repository;

import com.capfla.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {
}
