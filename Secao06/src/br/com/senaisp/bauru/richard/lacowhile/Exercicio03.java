package br.com.senaisp.bauru.richard.lacowhile;

public class Exercicio03 {

	public static void main(String[] args) {
		int limite=20;
		for (int lin=1;lin<=limite;lin++) {
			for (int col=1;col<=limite;col++) {
				//triangulo esq>dir col<=lin
				//triangulo dir>esq 11-col<=lin
				//diagonal esq>dir col==lin
				//diagonal dir<esq 11-col==lin
				//X 11-col==lin || col==lin
				//triangulo retangulo aberto 
				if (col==1 || lin==limite || lin==col) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}//fim do for coluna
			System.out.println();
		}//fim do for da linha
	}

}
