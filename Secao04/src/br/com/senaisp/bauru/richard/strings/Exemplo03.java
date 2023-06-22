package br.com.senaisp.bauru.richard.strings;

public class Exemplo03 {

	public static void main(String[] args) {
		String valor1 = "Hello World";
		//primeira operação - Tamanho da string
		System.out.println("Tamanho da string: " + valor1.length());
		//pegando um caracter da string - o do hello
		System.out.println("Letra o do hello: " + valor1.charAt(4));
		//buscando um caracter ou string na string - letra W .:
		System.out.println("A letra W está na posição " + 
							valor1.indexOf('W'));
		//pegando uma parte de string da string - lo .:
		System.out.println("Obtendo uma parte da string: " + 
		  valor1.substring(2,4));
		//usando o concat
		String valor2 = valor1 + " !!!";
		System.out.println(valor2);
		//comparando conteúdos
		//usando o equals (diferencia maiúsculas de minúsculas)
		if (valor1.equals(valor2)) {
			System.out.println("São iguais valor1 e valor2");
		} else {
			System.out.println("São diferentes valor1 e valor2");
		}
		//equalsIgnoreCase (não faz distinção entre maiúsculas e minúsculas)
		if (valor1.equalsIgnoreCase(valor2)) {
			System.out.println("São iguais valor1 e valor2");
		} else {
			System.out.println("São diferentes valor1 e valor2");
		}
		//compareTo
		//comparar se uma string é maior, menor ou igual a outra
		valor1="Richard";
		valor2="Roberto";
		if (valor1.compareTo(valor2)==0) { //são iguais
			System.out.println("São iguais valor1 e valor2");
		} else if (valor1.compareTo(valor2)>0) { //valor1 é maior q valor2
			System.out.println("valor1 é maior que valor2 " +
								valor1.compareTo(valor2));
		} else { //valor1 é menor que valor2
			System.out.println("valor1 é menor que valor2 "+
					 valor1.compareTo(valor2));			
		}
		//substituindo um conteúdo da string (todas ocorrências)
		System.out.println(valor1.replace("ch", "x"));
		//substituindo somente a primeira ocorrência
		System.out.println(valor2.replaceFirst("o", "a"));
	}

}
