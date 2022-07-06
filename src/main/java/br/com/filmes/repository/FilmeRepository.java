package br.com.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.filmes.model.FilmeModel;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, Long>{
}
