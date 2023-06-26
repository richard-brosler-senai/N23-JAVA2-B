package br.com.senaisp.bauru.richard.condicionais;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ValidadorData vl = new ValidadorData();
		System.out.println("Digite uma data no formato dd/mm/aaaa:");
		String dt = sc.nextLine();
		if (vl.isDataValida(dt)) {
			System.out.println("Data é válida!");
		} else {
			System.out.println("Data é inválida!");
		}
		sc.close();
	}

}
