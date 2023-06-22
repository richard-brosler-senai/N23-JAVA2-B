package br.com.senaisp.bauru.richard.strings;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor1 = "Hello";
		String valor2 = valor1;
		//Antes da operação
		System.out.println(valor1);
		System.out.println(valor2);
		valor1 += " world";
		//depois da operação
		System.out.println(valor1);
		System.out.println(valor2);
		//segunda operação
		valor2 += " 2";
		System.out.println(valor1);
		System.out.println(valor2);
	}

}
