package io.isiflix.desafio2;

import java.util.List;

public class Dia04 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		lista.stream()
		     .filter(p-> p.getNome().contains("Ana ") && p.getIdade() >= 30 && p.getIdade()<= 35)
		     .toList()
		     .forEach(p -> System.out.println(p));
		
	}

}
