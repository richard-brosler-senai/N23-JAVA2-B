package br.com.senaisp.bauru.richard.lacowhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número:");
		int numero = sc.nextInt();
		
		for(int i=1;i<=12;i++) {
			System.out.println(numero + "x" + i + "=" + (numero * i));
		}
		//exemplo com while
		int i=1;
		while(i<=12) {
			System.out.println(numero + "x" + i + "=" + (numero * i));
			i++;
		}
		//exemplo com do while
		i=1;
		do {
			System.out.println(numero + "x" + i + "=" + (numero * i));
			i++;
		}while(i<=12);
		
		sc.close();
		
	}

}
