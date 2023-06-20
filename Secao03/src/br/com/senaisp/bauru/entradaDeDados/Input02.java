package br.com.senaisp.bauru.entradaDeDados;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Olá pessoal, vamos continuar a seção 3!",
                "Aula 2023-06-16",
                JOptionPane.QUESTION_MESSAGE);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Qual o seu nome?",
                "Apresentações",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Digite seu nome aqui.");
        JOptionPane.showMessageDialog(null, "Olá, " + input1);
        
        String[] acceptableValues = {"São Paulo", "Corinthians", "Palmeiras", "Santos", "Outro"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Qual time você torce?",
                "Qual seu time",
                JOptionPane.QUESTION_MESSAGE,
                null,
                acceptableValues,
                acceptableValues[1]);
        JOptionPane.showMessageDialog(null, "Parabéns, " + input1 + 
        		" pelo seu time ser " + input2);
                
    }
}
