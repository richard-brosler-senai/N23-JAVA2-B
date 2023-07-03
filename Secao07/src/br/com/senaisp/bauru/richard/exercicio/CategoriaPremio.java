package br.com.senaisp.bauru.richard.exercicio;

import java.util.Random;

public class CategoriaPremio {
	private String nome;
	private int qtdeTicket;
	private int saldo;
	
	public CategoriaPremio(String nom, int qtdePrem) {
		Random rnd = new Random(1234);
		nome = nom;
		saldo = qtdePrem;
		qtdeTicket = rnd.nextInt(1,13);
	}
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public int getQtdeTicket() {
		return qtdeTicket;
	}
	
	@Override
	public String toString() {
		return "Nome prêmio..: " + nome + 
			 "\nValor prêmio.: " + qtdeTicket + 
			 "\nSaldo prêmio.: " + saldo + 
			 "\n" + "-".repeat(15);
	}
}
