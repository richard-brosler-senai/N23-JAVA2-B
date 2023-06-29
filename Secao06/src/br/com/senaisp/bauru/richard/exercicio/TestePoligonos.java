package br.com.senaisp.bauru.richard.exercicio;

public class TestePoligonos {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo(4);
		tri.montarTela();
		Retangulo ret = new Retangulo(5, 4);
		ret.montarTela();
		Retangulo ret2 = new Retangulo(5, 5);
		ret2.montarTela();
	}

}
