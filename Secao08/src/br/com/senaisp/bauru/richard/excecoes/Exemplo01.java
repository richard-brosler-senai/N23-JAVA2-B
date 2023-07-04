package br.com.senaisp.bauru.richard.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr = 0, quociente = 1, resultado = 0;
		do {
			try {
				System.out.println("Digite um valor:");
				vlr = sc.nextInt();
				System.out.println(vlr);
				resultado = quociente / vlr;
				System.out.println("Resultado = " + resultado);
			}catch(InputMismatchException e) {
				System.out.println("Favor digitar somente números!");
				sc.nextLine(); //não esquecer, caso contrário, laço infinito!
			}catch (Exception e) { //tratamento genérico
				System.out.println("Ocorreu um outro tipo de erro!");
				e.printStackTrace(); 
				//mostro o erro como se fosse o erro original
			}
		} while(vlr<=0);
		
		sc.close();
	}

}
