package br.com.syonet.business;

import java.util.Objects;

import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Livro;

public class LivroBusiness {
	private LivroDAO dao = new LivroDAO();
	
	public void salva ( Livro registro ) {
		if ( Objects.isNull(registro.getTitulo()) ) {
			throw new NullPointerException ("Título está nulo!");
		}
		if (Objects.isNull(registro.getNomeAutor())) {
			throw new NullPointerException ("Nome do autor está nulo!");
		}
		this.dao.salva(registro);
	}
	
	public Livro buscaPorId ( Integer id ) {
		return this.dao.buscaPorId(id);
	}
	
	public Livro buscaPorNomeAutor ( String nomeAutor ) {
		return this.dao.buscaPorAutor(nomeAutor);
	}
	
}
