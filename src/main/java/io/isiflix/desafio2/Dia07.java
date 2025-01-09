package io.isiflix.desafio2;

import java.util.List;

public class Dia07 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		lista.stream().map(p->Utilitarios.fromPessoaToUsuario(p))
		     .toList()
		     .forEach(u -> System.out.println(u));
		
	}

}
