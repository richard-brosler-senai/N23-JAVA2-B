package br.com.senaisp.bauru.richard.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrenome:" );
		String nome = sc.nextLine();
		
		SeparadorNome sp = new SeparadorNome();
		System.out.println("Sobrenome, nome: " + 
							sp.sobrenomeNome(nome));
		sc.close();
	}

}
