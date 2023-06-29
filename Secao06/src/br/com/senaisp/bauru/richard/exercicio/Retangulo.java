package br.com.senaisp.bauru.richard.exercicio;

public class Retangulo {
	private int largura;
	private int comprimento;
	public Retangulo(int lar, int comp) {
		largura = lar;
		comprimento = comp;
	}
	public void montarTela() {
		for(int lin=1;lin<=comprimento;lin++) {
			for(int col=1;col<=largura;col++) {
				if (lin==1 || lin==comprimento || 
					col==1 || col==largura ) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				} //fim else
			} //fim for coluna
			System.out.println();
		}//fim for linha
	}
}
