package br.com.syonet.principal;

import br.com.syonet.business.LivroBusiness;
import br.com.syonet.entidade.Autor;


public class App {

	public static void main(String[] args) {
		Autor gabriel = new Autor("Gabriel", "Fernandes", 859345200000L , "São Gabriel");
		Autor julian = new Autor("Julian", "Souza", 638420400000L , "Montenegro");
		
		LivroBusiness business1 = new LivroBusiness();
		LivroBusiness business2 = new LivroBusiness();
		business1.salva("Teste do Gabriel", "Gabriel's Tests", gabriel, "Harper", 400, 1);
		business2.salva("Teste do Julian", "Julian's Tests", julian, "Collins", 500, 1);
		
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
//		try {
//			System.out.println(business2.buscaPorNomeAutor("Gabriel"));
//		} catch (Exception e) {
//				e.printStackTrace();
//		}
		System.out.println(business1.buscaPorId(1));
		

		
		}

	}

