package br.com.senaisp.bauru.richard.strings;

public class Forca {
	private String palavra;
	private String palavraOculta;
	private int qtdeTentativas;
	private int qtdeErros;
	private boolean terminado;
	private boolean vencedor;
	
	private void inicializar() {
		palavraOculta = "-".repeat(palavra.length());
		qtdeTentativas = palavra.length() + 5;
		qtdeErros = 0;
		terminado = false;
		vencedor = false;
	}
	//constructor
	public Forca(String palavra) {
		this.palavra = palavra;
		inicializar();
	}
	//mostrar a tela
	public void mostrarTela() {
		String bDir =   qtdeErros > 0 ? "\\" : " ";
		String cabeca = qtdeErros > 1 ? "o" : " ";
		String bEsq =   qtdeErros > 2 ? "/" : " ";
		String corpo =  qtdeErros > 3 ? "|" : " ";
		String pDir =   qtdeErros > 4 ? "/" : " ";
		String pEsq =   qtdeErros > 5 ? "\\" : " ";
		String forca = " +----+\n"
					 + " |   " + bDir + cabeca + bEsq + "\n"
					 + " |    " + corpo + "\n"
					 + " |   " + pDir + " " + pEsq + "\n"
					 + " | \n"
					 + " ========\n\n"
					 + palavraOculta;
		System.out.println(forca);
	}
	public boolean isTerminado() {
		return terminado;
	}
	public boolean isVencedor() {
		return vencedor;
	}
	
	public boolean chuteLetra(char letra) {
		boolean ret = false;
		//se encontrou uma letra
		if (palavra.toLowerCase().indexOf((""+letra).toLowerCase())>-1) {
			String apoio = "";
			if (palavraOculta.toLowerCase().indexOf((""+letra).toLowerCase())>-1) {
				System.out.println("Vc já usou essa palavra!");
			} else {
				for(int i=0;i<palavra.length();i++) {
					if ((""+palavra.charAt(i)).equalsIgnoreCase(""+letra)) {
					//if (palavra.charAt(i)==letra) {
						apoio += palavra.charAt(i);
					} else {
						apoio += palavraOculta.charAt(i);
					}
				}
				palavraOculta = apoio;
			}
			ret = true;
		} else { //errou
			qtdeErros++;
		}
		qtdeTentativas--;
		vencedor = palavraOculta.equals(palavra);
		terminado = qtdeTentativas == 0 || qtdeErros > 5 || vencedor;
		return ret;
	}

}
