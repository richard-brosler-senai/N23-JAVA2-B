package br.com.senaisp.bauru.richard.exercicio;

public class Terminal {
	private CategoriaPremio premio1;
	private CategoriaPremio premio2;
	private CategoriaPremio premio3;

	public Terminal() {
		premio1 = null;
		premio2 = null;
		premio3 = null;
	}

	// Comportamentos
	// Inserindo créditos no cartão
	public void inserirCredito(Cartao card, int dinheiro) {
		if (card != null && dinheiro > 0) {
			int saldo = card.getSaldo() + dinheiro * 2;
			// atualizando o saldo
			card.setSaldo(saldo);
			// mostrando o saldo
			System.out.println(card.toString());
		}
	}

	// Mostrando o saldo do cartão
	public void mostrarSaldoCartao(Cartao card) {
		if (card != null) {
			System.out.println(card.toString());
		}
	}

	// Transferência de créditos de um cartão para outro cartão
	public void transferirCreditoTotal(Cartao cardOrigem, 
										Cartao cardDestino) {
		if (cardOrigem != null && cardDestino != null) {
			transferirCreditoParcial(cardOrigem, cardDestino, 
										cardOrigem.getSaldo());
		}
	}

	public void transferirCreditoParcial(Cartao cardOrigem, 
									Cartao cardDestino, int valor) {
		if (cardOrigem != null && cardDestino != null && valor > 0) {
			if (valor<=cardOrigem.getSaldo()) {
				
				//Retirando o valor da origem
				int saldoOri = cardOrigem.getSaldo() - valor;
				cardOrigem.setSaldo(saldoOri);
				
				//Colocando o valor no destino
				int saldoDes = cardDestino.getSaldo() + valor;
				cardDestino.setSaldo(saldoDes);
				
			} else {
				System.out.println("Saldo insuficiente!");
			}
			System.out.println("Cartão Origem.:");
			System.out.println(cardOrigem.toString());
			
			System.out.println("Cartão Destino:");
			System.out.println(cardDestino.toString());
		} else {
			System.out.println("Um dos cartões é inválido ou valor inválido!");
		}
	}
	
	public void resgatePremio(Cartao card, int idPremio) {
		if (card != null && idPremio>0 && idPremio<4 ) {
			int saldoTicket = card.getTicket();
			//preencher saldo de premios e quanto custa o premio
			CategoriaPremio premio = null;
			switch(idPremio) {
			case 1 -> premio = premio1;
			case 2 -> premio = premio2;
			default -> premio = premio3;
			}
			//verificando o saldo de tickets do cartão e 
			//se é suficiente para resgatar o prêmio
			if (saldoTicket>0 && saldoTicket>=premio.getQtdeTicket()) {
				if (premio.getSaldo()>0) {
					//ajustando o saldo de tickets no cartão
					card.setTicket(saldoTicket-premio.getQtdeTicket());
					//ajustando o saldo de prêmios
					premio.setSaldo(premio.getSaldo()-1);
				} else {
					System.out.println("Sem saldo de prêmio suficiente!");
				}
			} else {
				System.out.println("Sem saldo suficiente de tickets!");
			}
			//mostrar saldo do cartão e saldo de prêmio
			System.out.println("Dados do cartão");
			System.out.println(card.toString());
			System.out.println("Dados do prêmio");
			System.out.println(premio.toString());
		} else {
			System.out.println("cartão Inválido");
		}
	}

	public CategoriaPremio getPremio1() {
		return premio1;
	}

	public void setPremio1(CategoriaPremio premio1) {
		this.premio1 = premio1;
	}

	public CategoriaPremio getPremio2() {
		return premio2;
	}

	public void setPremio2(CategoriaPremio premio2) {
		this.premio2 = premio2;
	}

	public CategoriaPremio getPremio3() {
		return premio3;
	}

	public void setPremio3(CategoriaPremio premio3) {
		this.premio3 = premio3;
	}

}
