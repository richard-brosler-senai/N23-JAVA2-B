package br.com.senaisp.bauru.richard.exercicio;

import java.util.Scanner;

public class TesteJogos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Criando o vetor de objetos (não estou criando ainda cada objeto)
		Equipe[] equip = new Equipe[4];
		//Criando as equipes
		equip[0] = new Equipe("Corinthians");
		equip[1] = new Equipe("São Paulo");
		equip[2] = new Equipe("Santos");
		equip[3] = new Equipe("Palmeiras");
		//solicitando as temperaturas e gerando jogos
		do {
			System.out.println("Digite a temperatura:");
			double temp = sc.nextDouble();
			Jogos.criarJogo(temp, equip);
		}while(!Jogos.isFimTemporada());
		//mostrando resultados...
		int qtdeJogos = 0;
		double maiorTemp = 0, somaTemp = 0;
		System.out.println("*** Resultados ***");
		//percorrendo os times
		for(Equipe eq : equip) {
			System.out.println(eq.toString());
		}
		//percorrendo os jogos
		for(Jogos jg : Jogos.getListaJogos()) {
			qtdeJogos++;
			somaTemp += jg.getTemperatura();
			if (jg.getTemperatura()>maiorTemp) {
				maiorTemp = jg.getTemperatura();
			}
			System.out.println(jg.toString());
		}
		//mostrar maior temperatura e a média de temperatura
		System.out.println("Maior temperatura da temporada: " + 
								maiorTemp);
		System.out.println("Média temperatura da temporada: " + 
							(somaTemp / qtdeJogos));
		//fechando o scanner
		sc.close();
	}

}
