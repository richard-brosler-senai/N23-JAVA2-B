package br.com.senaisp.bauru.richard.calculadora;

public class Calculadora {
	double imposto = 0.05;
	double gorjeta = 0.15;
	
	/*
	public static void main(String[] args) {
		
		
		double pessoa01 = 12;
		double total01 = pessoa01 * (1 + imposto + gorjeta);
		System.out.println("Pessoa 01: " + total01);

		double pessoa02 = 10;
		double total02 = pessoa02 * (1 + imposto + gorjeta);
		System.out.println("Pessoa 02: " + total02);
		calculaValor(12, "Pessoa 01");
		calculaValor(10, "Pessoa 02");
		
	}
	*/
	
	public double calculaValor(double vlrPessoa, 
								String nomePessoa,
							   double totalPagante,
							   double valorARatear) {
		double vlrRateio = vlrPessoa / totalPagante * valorARatear;
		double total = (vlrPessoa + vlrRateio) * (1 + imposto + gorjeta);
		System.out.println(nomePessoa + " : " + total);
		return total;
	}
}
