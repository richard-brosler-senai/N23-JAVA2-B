package br.com.senaisp.bauru.conversao;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
    	byte bytVlr = 127;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
    	short shrVlr = 128;
    	System.out.println((byte) shrVlr);
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
    	System.out.println(++bytVlr);
    	
    	System.out.println(++bytVlr);
        
        
    }    
}
