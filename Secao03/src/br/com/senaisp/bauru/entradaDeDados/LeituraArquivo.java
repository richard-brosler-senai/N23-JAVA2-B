package br.com.senaisp.bauru.entradaDeDados;

import java.util.Scanner;

public class LeituraArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(LeituraArquivo.class
				.getResourceAsStream("csvjson.csv"));
		String linha = sc.nextLine();
		linha = sc.nextLine();
		while (linha != null) {
			Scanner sc2 = new Scanner(linha);
			sc2.useDelimiter(";");
			//pegando a primeira coluna e tirando o caracter "
			System.out.print(sc2.next().replaceAll("\"", ""));
			//pegando a segunda coluna
			System.out.print("\t" + sc2.next());
			//pegando a terceira coluna
			System.out.println("\t" + sc2.next().replaceAll("\"", ""));
			//fechando o sc2
			sc2.close();
			if ( sc.hasNextLine()) {
				linha = sc.nextLine();
			} else {
				linha = null;
			}
		}//fim do while
		sc.close();
		//System.out.println(linha);
	}

}
