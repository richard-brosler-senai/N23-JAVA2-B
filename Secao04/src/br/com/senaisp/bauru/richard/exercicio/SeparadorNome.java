package br.com.senaisp.bauru.richard.exercicio;

public class SeparadorNome {
	public String sobrenomeNome(String nome) {
		//                              0         1
		//                              01234567890123
		//vou passar o nome por exemplo Maria Madalena da silva
		//Vou retornar Madalena, Maria
		String sobr, nom;
		if (nome.indexOf(' ')>-1) {
			sobr = nome.substring(nome.indexOf(' ')+1); //usar funções
			nom = nome.substring(0,nome.indexOf(' '));  //usar funções
			//testando se há nome do meio
			if (sobr.indexOf(' ')>-1) {
				nom += " " + sobr.substring(0,sobr.lastIndexOf(' '));
				sobr = sobr.substring(sobr.lastIndexOf(' ')+1);
			}
		} else {
			sobr = "";
			nom = "";
			System.out.println("Favor digitar nome e sobrenome!");
		}
		return sobr + ", "+ nom;
	}
}
