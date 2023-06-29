package br.com.senaisp.bauru.richard.exercicio;

public class Triangulo {
	private int altura;
	public Triangulo(int altura) {
		this.altura = altura;
	}
	public void montarTela() {
		for(int lin=1;lin<=altura;lin++) {
			for(int col=1;col<=altura;col++) {
				if (col==1 || lin==altura || lin==col) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				} //fim else
			}//fim for coluna
			System.out.println();
		}//fim for linha
	} //fim montar tela
}
