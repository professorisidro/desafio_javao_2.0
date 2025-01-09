package io.isiflix.desafio2;

import java.util.Comparator;
import java.util.List;

public class Dia03 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
	
		System.out.println("Ordenando em ordem crescente");
		lista.stream().sorted(Comparator.comparing((Pessoa p)-> p.getNome()))
		              .toList()
		              .forEach(p -> System.out.println(p));

		System.out.println("Ordenando em ordem decrescente");
		lista.stream().sorted(Comparator.comparing((Pessoa p)-> p.getNome()).reversed())
		              .toList()
		              .forEach(p -> System.out.println(p));
		
	}

}
