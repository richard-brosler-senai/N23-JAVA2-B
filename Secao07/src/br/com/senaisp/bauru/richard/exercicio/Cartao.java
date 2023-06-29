package br.com.senaisp.bauru.richard.exercicio;

public class Cartao {
	private static int contadorInstancia = 0;
	//campos
	private int saldo;
	private int ticket;
	private int numCartao;
	public Cartao() {
		contadorInstancia++;
		numCartao = contadorInstancia;
		saldo = 0;
		ticket = 0;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	public int getNumCartao() {
		return numCartao;
	}
}
