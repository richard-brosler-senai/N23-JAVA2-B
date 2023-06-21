package br.com.senaisp.bauru.richard.calculadora;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		double totalGeral = 0;
		
		double totalPagante = 10 + 12 + 9 + 8 + 7 + 15 + 11;
		double valorARatear = 30;
		
		totalGeral += calc.calculaValor(10, "Pessoa 01",totalPagante,valorARatear);
		totalGeral += calc.calculaValor(12, "Pessoa 02",totalPagante,valorARatear);
		totalGeral += calc.calculaValor( 9, "Pessoa 03",totalPagante,valorARatear);
		totalGeral += calc.calculaValor( 8, "Pessoa 04",totalPagante,valorARatear);
		totalGeral += calc.calculaValor( 7, "Pessoa 05",totalPagante,valorARatear);
		totalGeral += calc.calculaValor(15, "Pessoa 06",totalPagante,valorARatear);
		totalGeral += calc.calculaValor(11, "Pessoa 07",totalPagante,valorARatear);
		//totalGeral += calc.calculaValor(30, "Pessoa 08",totalPagante,valorARatear);
		
		System.out.println("Total geral: " + totalGeral);
	}

}
