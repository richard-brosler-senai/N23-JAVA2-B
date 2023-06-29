package br.com.senaisp.bauru.richard.condicionais;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10:");
		int num = sc.nextInt();
		//vamos ver o exemplo do switch e a importância do break
		String mensagem = "Parabéns você ganhou ";
		switch(num) {
		case 10: 
			mensagem += "uma pilha\n";
		case 9:
			mensagem += "uma caneta\n";
		case 8:
			mensagem += "um lápis\n";
		case 7:
			mensagem += "um apontador\n";
		case 6:
			mensagem += "um transferidor\n";
		case 5:
			mensagem += "uma régua\n";
		case 4:
			mensagem += "uma borracha\n";
		case 3:
			mensagem += "uma lapiseira\n";
		case 2:
			mensagem += "um compasso\n";
		case 1:
			mensagem += "um mouse\n";
			break;
		default:
			mensagem += "nada!!!";
		}
		System.out.println(mensagem);
		sc.close();
	}

}
