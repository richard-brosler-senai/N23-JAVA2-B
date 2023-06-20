package br.com.senaisp.bauru.entradaDeDados;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int vlr1, vlr2, vlr3, soma = 0;
        System.out.println("Digite os valores inteiros para somar:");
        vlr1 = sc.nextInt();
        vlr2 = sc.nextInt();
        vlr3 = sc.nextInt();
        soma = vlr1 + vlr2 + vlr3;
        System.out.println("A soma dos 3 números é : " + soma);
        //Remember to close the Scanner
        sc.close();
    }
}
