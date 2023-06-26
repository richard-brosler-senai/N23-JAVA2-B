package br.com.senaisp.bauru.richard.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		Calculo calc = new Calculo();
		System.out.println("Temperatura: " + calc.fToC(60));
		System.out.println("Hipotenusa: " + calc.hypotenuse(10,20));
		System.out.println("Soma dados: " + calc.roll());
	}

}
