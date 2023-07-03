package br.com.senaisp.bauru.richard.exercicio;

import java.util.Random;

public class Jogo {
	private int consumoCredito;
	private int premioTicket;

	public Jogo() {
		Random rnd = new Random(1234);
		consumoCredito = rnd.nextInt(2, 11);
		premioTicket = rnd.nextInt(2, 16);
	}

	public int getConsumoCredito() {
		return consumoCredito;
	}

	public int getPremioTicket() {
		return premioTicket;
	}

	// comportamentos
	public void lerCartao(Cartao card) {
		if (card != null) {
			if (consumoCredito > card.getSaldo()) {
				System.out.println("Infelizmente você está " + "sem saldo suficiente!");
			} else {
				int apoio = card.getSaldo() - consumoCredito;
				card.setSaldo(apoio);

				apoio = card.getTicket() + premioTicket;
				card.setTicket(apoio);
			}
			System.out.println(card.toString());
		} else {
			System.out.println("Cartão inválido!");
		}
	}
}
