package br.com.syonet.principal;

import br.com.syonet.business.LivroBusiness;
import br.com.syonet.entidade.Livro;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro1 = new Livro();
		livro1.setNomeAutor(" Gabriel 2 ");
		livro1.setTitulo("livro teste 2");
		System.out.println("Livro em memória " + livro1.getTitulo() + livro1.getId() + livro1.getNomeAutor());
		LivroBusiness business = new LivroBusiness();
		business.salva(livro1);
		System.out.println("Livro salvo no banco de dados");
		
		LivroBusiness business1 = new LivroBusiness();
		LivroBusiness business2 = new LivroBusiness();
		
		try {
		System.out.println(business1.buscaPorId(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(business1.buscaPorId(1));
		} catch (Exception e) {
				e.printStackTrace();
		}
		try {
			System.out.println(business2.buscaPorNomeAutor("Gabriel"));
		} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println(business1.buscaPorId(1));
		
		//System.out.println(business2.buscaPorNomeAutor("AutorTeste"));
	}

}
