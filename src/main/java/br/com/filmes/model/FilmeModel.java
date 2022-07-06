package br.com.filmes.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_FILME")
public class FilmeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "O campo titulo não pode ser vazio")
	@NotNull(message = "O campo titulo não pode ser nulo")
	@Column(nullable = false)
	private String titulo;
	
	@NotEmpty(message = "O campo titulo não pode ser vazio")
	@NotNull(message = "O campo titulo não pode ser nulo")	
	@Column(nullable = false)
	private String descricao;
	
	@NotEmpty(message = "O campo titulo não pode ser vazio")
	@NotNull(message = "O campo titulo não pode ser nulo")
	@Column(nullable = false)	
	private String autor;

	public FilmeModel() {}
	
	public FilmeModel(Long id, String titulo, String descricao, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilmeModel other = (FilmeModel) obj;
		return Objects.equals(id, other.id);
	}
}
