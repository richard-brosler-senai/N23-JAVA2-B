package br.com.senaisp.bauru.richard.condicionais;

public class ValidadorData {
	
	public boolean isDataValida(String data) {
		boolean ret = true;
		//0123456789
		//01/10/2023
		//testando a / da data
		if (data.indexOf('/')>-1) {
			//posição primeira barra deve ser diferente da última
			if (data.indexOf('/')!=data.lastIndexOf('/')) {
				int dia = Integer.parseInt(
							data.substring(0,data.indexOf('/'))
							);
				//
				int mes = Integer.parseInt(
							data.substring(data.indexOf('/')+1,
										   data.lastIndexOf('/'))
							);
				//
				int ano = Integer.parseInt(
							data.substring(data.lastIndexOf('/')+1)
							);
				//testando os valores
				System.out.println(dia + "-" + mes + "-" + ano);
			} else {
				ret = false; //só tem uma / na data
			}
			//--------------------------
		} else {
			ret = false; //faltou a / de data
		}
		
		
		return ret;
	}
}
