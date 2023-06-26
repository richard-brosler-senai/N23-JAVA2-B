package br.com.senaisp.bauru.richard.math;

public class Exemplo01 {

	public static void main(String[] args) {
		//extraindo a raiz quadrada de um valor
		double raiz01 = Math.sqrt(25);
		System.out.println(raiz01);
		//utilizando a potenciação
		double pot01 = Math.pow(2, 3);
		System.out.println(pot01);
		//raiz cúbica
		double raiz02 = Math.pow(8, 1/3.0);
		System.out.println("Raiz cúbica: " + raiz02);
		//valor absoluto
		System.out.println("Absoluto de -1: " + Math.abs(-1));
		System.out.println(Math.PI);
	}

}
