package br.com.senaisp.bauru.richard.condicionais;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor positivo: ");
		//vamos verificar se o número é par ou impar
		int numero = sc.nextInt();
		if ( numero % 2 == 0 ) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é impar!");
		}
		
		sc.close();
	}

}
