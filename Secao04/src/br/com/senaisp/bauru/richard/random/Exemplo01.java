package br.com.senaisp.bauru.richard.random;

import java.util.Random;

public class Exemplo01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		//numeros inteiros aleatórios 0 - máximo de inteiro
		int vlr01 = rnd.nextInt();
		System.out.println(vlr01);
		//gerando um valor de 0 a 10
		vlr01 = rnd.nextInt(11);
		System.out.println("0-10: " + vlr01);
		//gerando um valor de 10 a 20
		vlr01 = rnd.nextInt(10,21);
		System.out.println("10-20: " + vlr01);
		//gerando números aleatórios fracionários
		double vlr02 = rnd.nextDouble(100.00);
		System.out.println("Fracionário até 100.01: " + vlr02);
		//indicando a semente de geração de aleatórios
		rnd.setSeed(1234);
		vlr01 = rnd.nextInt(10);
		System.out.println("Com Seed 1234:" + vlr01);
	}

}
