package br.com.senaisp.bauru.richard.lacowhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 7531, pin, tentativas = 0;
		do {
			System.out.println("Digite a senha:");
			pin = sc.nextInt();
			if (pin != senha) {
				System.out.println("Senha inválida! Redigite!");
				tentativas++;
			}
		}while(pin!=senha && tentativas<3);//enquanto verdade
		if (tentativas<3) {
			System.out.println("Acesso Liberado!");
		} else {
			System.out.println("Acesso bloqueado! :`-(");
		}
		sc.close();
	}

}
