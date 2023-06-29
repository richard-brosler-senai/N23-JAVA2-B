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
				switch(mes) {
				case 1: //janeiro
				case 3: //março
				case 5: //maio
				case 7: //julho
				case 8: //agosto
				case 10: //outubro
				case 12: //dezembro
					if (dia < 1 || dia > 31) { 
						ret = false;
					}
					break;
				case 4: //abril
				case 6: //junho
				case 9: //setembro
				case 11: //novembro
					if (dia < 1 || dia > 30) {
						ret = false;
					}
					break;
				case 2: //fevereiro ( o mais chato )
					boolean isBis = (ano % 4 == 0 && ano % 100 != 0) || 
									(ano % 100==0 && ano % 400 == 0);
					if (dia<1 || dia>29) {
						ret = false;
					}
					//só pode ser 29 dias se for ano bissexto
					if (dia==29 && !isBis) {
						ret = false;
					}
					break;
				default: 
					ret= false;
				}
				//teste sobre o ano
				if (ano<0 || ano>9999) {
					ret = false;
				}
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
