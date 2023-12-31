package br.com.senaisp.bauru.entradaDeDados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Solicitando uma data
		System.out.println("Entre com sua data de nascimento"
				+ " no formato dd/mm/yyyy:");
		//entrada como uma string
		String linha = sc.nextLine();
		sc.close();
		//abro o scanner a partir da string
		sc = new Scanner(linha);
		int dia, mes, ano;
		sc.useDelimiter("/"); //\d{3}\.\d{3}\.\d{3}\-\d{2}
		dia = sc.nextInt();
		mes = sc.nextInt();
		ano = sc.nextInt();
		
		System.out.println("Você tem " + 
		(2023 - ano + " anos de idade"));
		
		sc.close();
	}

}
