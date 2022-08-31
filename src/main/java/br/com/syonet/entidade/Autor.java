package br.com.syonet.entidade;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	
	@Column
	private long dataNascimento;
	
	@Column
	private String localNascimento;
	
	@OneToMany( mappedBy="autor" )
	private Set <Livro> livros = new HashSet();
	
	
	public Autor(String nome, String sobrenome, long dataNascimento, String localNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.localNascimento = localNascimento;
	}
	public Autor() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public long getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	
	public String toString() {
		return " " + getNome();
	}
}
