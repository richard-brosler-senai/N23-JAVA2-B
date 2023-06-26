package br.com.senaisp.bauru.richard.exercicio;

import java.util.Random;

public class Calculo {
	public double fToC(double degreesF) {
		// c = 5 / 9 * (F - 32)
		double c, F;
		F = degreesF;
		c = 5.0 / 9.0 * (F - 32);
		return c;
	}
	public double hypotenuse(int a, int b) {
		// c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		return c;
	}
	public int roll() {
		Random rnd = new Random();
		return rnd.nextInt(1, 7) + rnd.nextInt(1, 7);
	}
}
