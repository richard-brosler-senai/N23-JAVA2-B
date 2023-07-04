package br.com.senaisp.bauru.richard.arrays;

public class Exemplo02 {
	public static void main(String[] args) {
		int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 };
		int min = array[array.length - 1]; // initialize the current minimum
		int max = array[0];
		/*
		for (int index = 0; index < array.length; index++) {
			if (array[index] < min)
				min = array[index];
			if (array[index] > max)
				max = array[index];
		}
		*/
		//Essa forma de for é chamada de foreach
		for ( int valor : array) {
			if (valor < min)
				min = valor;
			if (valor > max)
				max = valor;
		}
		System.out.println("O valor mínimo do vetor é : " + min);
		System.out.println("O valor máximo do vetor é : " + max);
		int index = 8;
		if (index <= array.length-1) {
			System.out.println("Aqui vai ocorrer um "
				+ "ArrayIndexOutOfBounds" + array[index]);
		}
		
	}
}
