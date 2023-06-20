package br.com.senaisp.bauru.entradaDeDados;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(
        		Input04.class
        		.getResourceAsStream("input04text.txt"));
        
        //Edit these lines to advance the scanner
        sc.nextLine(); //linha 1
        System.out.println(sc.nextLine()); //linha 2
        sc.nextLine(); //linha 3
        //sc.nextLine(); //linha 4
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPosition = 0, yPosition = 0;
        xPosition = sc.nextInt();
        yPosition = sc.nextInt();
        System.out.println("X: "+xPosition +", Y: " + yPosition );
        sc.close();
    }    
}
