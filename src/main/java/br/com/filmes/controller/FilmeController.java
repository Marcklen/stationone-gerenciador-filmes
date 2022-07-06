package br.com.filmes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmes.exception.RegraNegocioException;
import br.com.filmes.model.FilmeModel;
import br.com.filmes.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FilmeModel criarFilme (@RequestBody @Valid FilmeModel filmeModel) {
		return filmeRepository.save(filmeModel);
	}
	
	@GetMapping
	public List<FilmeModel> listarTodos(){
		return filmeRepository.findAll();
	}
	
	@GetMapping("{id}")
	public FilmeModel buscarPorId(@PathVariable Long id) {
		return filmeRepository
				.findById(id)
				.orElseThrow(() -> new RegraNegocioException("ID do Filme Não Encontrado"));
	}
}