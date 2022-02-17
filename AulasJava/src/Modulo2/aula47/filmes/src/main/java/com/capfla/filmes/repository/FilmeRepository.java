package com.capfla.filmes.repository;

import com.capfla.filmes.model.filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<filme,Integer> {
}
