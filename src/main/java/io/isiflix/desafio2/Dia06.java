package io.isiflix.desafio2;

import java.util.List;

public class Dia06 extends DiaGenerico{

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		int maiorIdade = lista.stream().mapToInt(p->p.getIdade()).max().getAsInt();
		int menorIdade = lista.stream().mapToInt(p->p.getIdade()).min().getAsInt();
		int somaIdade  = lista.stream().mapToInt(p->p.getIdade()).sum();
		double mediaIdade = lista.stream().mapToInt(p->p.getIdade()).average().getAsDouble();
		
		System.out.println("Maior idade:"+maiorIdade);
		System.out.println("Menor idade:"+menorIdade);
		System.out.println("Soma  idade:"+somaIdade);
		System.out.println("Media idade:"+mediaIdade);
		
	}

}
