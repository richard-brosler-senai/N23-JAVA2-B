
public class ExemploCaracter01 {

	public static void main(String[] args) {
		char letter1 = 'H';
		char letter2 = 'e';
		char letter3 = 'l';
		char letter4 = 'l';
		char letter5 = 'o';
		//Sem a String em branco
		System.out.println(letter1 + letter2 + letter3 
				+ letter4 + letter5 );
		//Com a String em branco
		letter1=65;
		System.out.println("" + letter1 + letter2 + letter3 
				+ letter4 + letter5 );
		System.out.println("Olá " + 1 + 2 + 3 + 4);
		
		System.out.println("Olá mundo".substring(3));
	}

}
