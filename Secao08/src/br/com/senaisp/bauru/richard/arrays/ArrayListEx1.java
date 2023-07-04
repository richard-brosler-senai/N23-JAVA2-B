package br.com.senaisp.bauru.richard.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

    public static void main(String[] args) {
       ArrayList<String> estudantes = new ArrayList<>();
       //adicionando os estudantes...
       estudantes.add("Joaquim");
       estudantes.add("Emanuel");
       estudantes.add("João");
       estudantes.add(1,"Maria");
       //listando os alunos
       for(String aluno: estudantes) {
    	   System.out.println(aluno);
       }
       //
       System.out.println("Utilizando o iterator para listar....");
       //utilizando iterator
       Iterator<String> iterator = estudantes.iterator();
       while (iterator.hasNext()) {
    	   System.out.println("Nome: " + iterator.next());
       }
       //
       System.out.println("Utilizando o listIterator para listar ...");
       ListIterator<String> lstIter = estudantes.listIterator();
       while (lstIter.hasNext()) {
    	   System.out.println("Nome (next): " + lstIter.next());
       }
       System.out.println("Voltando com previous...");
       while(lstIter.hasPrevious()) {
    	   System.out.println("Nome (previous): " + lstIter.previous());
       }
    }
}
