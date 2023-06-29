package br.com.senaisp.bauru.richard.lacofor;

public class Exemplo01 {

	public static void main(String[] args) {
		//variação do laço for com inicialização, teste e incremento
		for(int i=0;i<10;i+=1) {
			System.out.println(i);
			
			
		}
		//System.out.println(i);
		//omitindo a inicializacao, teste e atribuição
		for(int i=0;;i++) {
			System.out.println("laço infinito");
			if (i==15) {
				break;
			}
		}
		//frequencia de fibonacci
		//0 1 1 2 3 5 8 13 
		for (int ni=0,nii=1,soma=0;ni<100;soma=ni+nii,ni=nii,nii=soma) {
			System.out.println(ni);
		}
		//		for (int i=0,ni=1;i<100;i=ni,ni+=i) {
		//			System.out.println(ni);
		//		}
		
	}

}
