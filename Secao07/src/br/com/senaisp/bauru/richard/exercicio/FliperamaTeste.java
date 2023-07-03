package br.com.senaisp.bauru.richard.exercicio;

public class FliperamaTeste {

	public static void main(String[] args) {
		//criar 2 cartões
		Cartao card1 = new Cartao();
		Cartao card2 = null;// new Cartao();
		//criar 3 categorias de premios
		CategoriaPremio cat01 = new CategoriaPremio("Gold", 15);
		CategoriaPremio cat02 = new CategoriaPremio("Silver", 20);
		CategoriaPremio cat03 = new CategoriaPremio("Bronze",25);
		//criar 2 jogos
		Jogo jogo01 = new Jogo();
		Jogo jogo02 = new Jogo();
		//criar 1 terminal
		Terminal term = new Terminal();
		//Amarrando as categorias ao terminal
		term.setPremio1(cat01);
		term.setPremio2(cat02);
		term.setPremio3(cat03);
		//inserindo valor no primeiro cartão
		term.inserirCredito(card1, 50);
		//tentando gastar em um jogo
		jogo01.lerCartao(card2);
		//gastando no cartão 1
		jogo01.lerCartao(card1);
		jogo01.lerCartao(card1);
		//transferindo créditos para o cartão 2
		term.transferirCreditoParcial(card1, card2, 40);
		//gastando no cartão 2
		jogo02.lerCartao(card2);
		//tentar transferir 40 créditos para o cartão 1
		term.transferirCreditoParcial(card2, card1, 40);
		//resgatar os prêmios usando o cartão 1
		term.resgatePremio(card1, 1);
		term.resgatePremio(card1, 2);
		term.resgatePremio(card1, 3);
		//transferir o total do cartão 1 para o cartão 2
		term.transferirCreditoTotal(card1, card2);
	}

}
