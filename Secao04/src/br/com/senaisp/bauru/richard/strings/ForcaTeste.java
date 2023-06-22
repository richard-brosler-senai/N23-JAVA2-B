package br.com.senaisp.bauru.richard.strings;

import java.util.Scanner;

public class ForcaTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Forca forca = new Forca("Otorrinolaringologista");
		forca.mostrarTela();
		do {
			System.out.println("Digite uma letra:");
			char letra = sc.nextLine().charAt(0);
			forca.chuteLetra(letra);

			forca.mostrarTela();
		} while (!forca.isTerminado());
		if (forca.isVencedor()) {
			System.out.println("Você venceu!!");
		} else {
			System.out.println("Você perdeu!!");
		}
		sc.close();

	}

}
