package io.isiflix.desafio2;

import java.util.Comparator;
import java.util.List;

public class Dia08 extends DiaGenerico {

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		lista.stream().map(p->Utilitarios.fromPessoaToUsuario(p))
		              .filter(u->u.email().contains("@gmail.com"))
		              .sorted(Comparator.comparing(Usuario::email))
		              .toList()
		              .forEach(u->System.out.println(u));
		
		
		System.out.println(lista.stream().sorted(Comparator.comparing(Pessoa::getIdade).reversed()).toList().get(0));
	}

}
