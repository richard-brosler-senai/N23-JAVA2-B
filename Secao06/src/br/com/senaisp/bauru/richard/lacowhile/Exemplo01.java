package br.com.senaisp.bauru.richard.lacowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		while(idade<1 || idade>120) {
			System.out.println("Digite sua idade:");
			idade = sc.nextInt();
			if (idade<1 || idade>120) {
				System.out.println("Idade Inválida! Redigite!");
			}
		}
		System.out.println("Parabéns, você digitou uma idade válida!");
		sc.close();
	}

}
