package br.com.senaisp.bauru.conversao;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "65.3";
        String taxRate = "1.07";
        String gibberish = "887ds7nds87dsfs";
        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax = Double.parseDouble(shirtPrice) * 
        					Double.parseDouble(taxRate);
        
        System.out.println("Total : " + totalTax);
        
        //Try to parse taxRate as an int
        //Nesse caso tenho um erro de conversão
        //System.out.println(Integer.parseInt(taxRate));
        
        System.out.println((int) Double.parseDouble(taxRate));
        //Try to parse gibberish as an int
        System.out.println(Integer.parseInt(gibberish.substring(0, 3)));
        
    }
    
}
