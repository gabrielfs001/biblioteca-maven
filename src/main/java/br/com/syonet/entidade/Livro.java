package br.com.syonet.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "syo_livro" )
public class Livro {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column
	private String tituloOriginal;
	
	@Column(nullable = false)
	private String nomeAutor;
	
	@Column
	private String editora;
	
	@Column(name = "no_numeroPaginas")
	private Integer numeroPaginas;
	
	@Column(name = "no_numeroEdicao")
	private Integer numeroEdicao;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public Integer getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(Integer numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
	public String toString() {
		return "ID: " + getId() +" - Título: " + getTitulo() + " - Nome Autor: " + getNomeAutor() + ".";
	}
}
