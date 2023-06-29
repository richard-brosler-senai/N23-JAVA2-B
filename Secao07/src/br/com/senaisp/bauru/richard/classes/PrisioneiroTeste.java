package br.com.senaisp.bauru.richard.classes;

public class PrisioneiroTeste {

	public static void main(String[] args) {
		Prisioneiro bubba = new Prisioneiro();
		Prisioneiro twitch = new Prisioneiro();
		//atribuindo as propriedades
		bubba.setNome("Bubba");
		bubba.setAltura(2.08);
		bubba.setDetencao(4);
		
		twitch.setNome("Twich");
		twitch.setAltura(1.73);
		twitch.setDetencao(3);
		
		/*
		twitch.nome = "Bubba";
		twitch.altura = 2.08;
		twitch.detencao = 4;
		*/
		
		System.out.println(bubba.toString());
		System.out.println(twitch.toString());
		
		//tiramos o objeto twitch da memória com essa atribuição
		//twitch = bubba; 

		System.out.println(bubba.toString());
		System.out.println(twitch.toString());
		//Sempre vai ser diferente, desde que crie-se um
		//teste de endereços do objeto
		if (bubba == twitch) {
			System.out.println("Endereços iguais");
		} else {
			System.out.println("Endereços diferentes");
		}
		//verificação de conteúdo
		if (bubba.getNome().equals(twitch.getNome())) {
			System.out.println("São os mesmos conteúdos");
		} else {
			System.out.println("São conteúdos diferentes");
		}
		System.out.println("Qtde de prisioneiros: " + 
					Prisioneiro.getQtdePrisioneiros());
		
	}

}
