package br.com.senaisp.bauru.richard.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayList2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Integer> valores = new ArrayList<>();
		//adicionando alguns valores para o nosso arraylist
		for(int i=0;i<20;i++) {
			valores.add(rnd.nextInt(1,101));
		}
		//criando um iterator
		Iterator<Integer> iter = valores.iterator();
		//listando os valores
		while(iter.hasNext()) {
			int vlr = iter.next();
			System.out.println(vlr);
			//verificando se ele é par
			if (vlr%2==0) {
				iter.remove();
			} //fim if
		} //fim while
		//listar os itens depois de removido os pares
		System.out.println("Sem os pares ....");
		for(int vlr : valores) {
			System.out.println(vlr);
		}
	}

}
