package br.com.senaisp.bauru.entradaDeDados;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		final String TITULO = "Jogo do Milhão";
		String questao01 = (String) JOptionPane.showInputDialog(
				null,
				"Digite seu nome", 
				TITULO,
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite seu nome aqui");
		String questa02 = (String) JOptionPane.showInputDialog(
				null,
				"Digite seu e-mail", 
				TITULO,
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite seu e-mail aqui");
		String questao03 = (String) JOptionPane.showInputDialog(
				null,
				"Qual é a sua idade?", 
				TITULO,
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite sua idade aqui");
		int idade = Integer.parseInt(questao03);
		int questao04 = JOptionPane.showConfirmDialog(
				null,
				"Sua idade é "+ idade + "? Tem certeza disso?", 
				TITULO,
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null);
		
		JOptionPane.showMessageDialog(null, "Vamos começar!!!");
		String questao05 = (String) JOptionPane.showInputDialog(
				null,
				"Quem descobriu o Brasil?", 
				TITULO,
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite o nome de quem descobriu o Brasil");
		String questao06 = (String) JOptionPane.showInputDialog(
				null,
				"Quanto o Brasil gasta em média com Educação?", 
				TITULO,
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite o valor em reais");
		double valorGasto = Double.parseDouble(questao06);
		
		
	}

}
