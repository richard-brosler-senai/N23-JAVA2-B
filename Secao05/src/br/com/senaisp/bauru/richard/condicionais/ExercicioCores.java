package br.com.senaisp.bauru.richard.condicionais;

import java.util.Scanner;

public class ExercicioCores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da onda de cor:");
		int cor = sc.nextInt();
		
		if (cor >= 380 && cor < 450) {
			System.out.println(Cores.PURPLE_BOLD + "Violeta" + Cores.RESET);
		} else if (cor >= 450 && cor < 495) {
			System.out.println(Cores.BLUE_BOLD + "Azul" + Cores.RESET);
		} else if (cor >= 495 && cor < 570) {
			System.out.println(Cores.GREEN_BOLD + "Verde" + Cores.RESET);
		}else if (cor >= 570 && cor < 590) {
			System.out.println(Cores.YELLOW_BOLD + "Amarelo" + Cores.RESET);
		}else if (cor >= 590 && cor < 620) {
			System.out.println("\033[1m"+"\033[38;5;214m" + "Laranja" + Cores.RESET);
		}else if (cor >= 620 && cor < 750) {
			System.out.println(Cores.RED_BOLD + "Vermelho" + Cores.RESET);
		}else {
			System.out.println("Cor inválida!");
		}
		sc.close();
	}

}
