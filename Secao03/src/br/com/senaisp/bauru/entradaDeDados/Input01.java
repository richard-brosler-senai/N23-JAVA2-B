package br.com.senaisp.bauru.entradaDeDados;

import javax.swing.JOptionPane;

public class Input01 {

	public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        //String strInput = JOptionPane.showInputDialog("Digite algo:");
        String strInput = (String) JOptionPane.
        		showInputDialog(
        				null, //Janela parente para o diálogo
        				"Digite algo:", //mensagem de pedido ao usuário
        				"Titulo da janela",
        				JOptionPane.WARNING_MESSAGE, //tipo de mensagem
        				null, //objeto ícone para janela
        				null, //caixa de seleção de valores (valores possíveis)
        				"Você precisa digitar um valor numérico" //valor default
        				);
        System.out.println(strInput);
        JOptionPane.showMessageDialog(null, strInput);
        //Parse the input as an int.
        //Print its value +1
        JOptionPane.showMessageDialog(null, 
        		Integer.parseInt(strInput) + 1);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

	}

}
