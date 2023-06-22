package br.com.senaisp.bauru.richard.strings;

public class Exemplo01 {

	public static void main(String[] args) {
		String valor1 = "Hello";
		String valor2 = "Hello";
		//comparando endereços de memória, não o conteúdo
		if (valor1==valor2) {
			System.out.println("São o mesmo endereço de memória");
		} else {
			System.out.println("São diferentes os endereços");
		}
		//para comparar conteúdos de string, usar equals
		if (valor1.equals(valor2)) {
			System.out.println("Conteúdos idênticos");
		} else {
			System.out.println("Conteúdos diferentes");
		}
		
	}

}
