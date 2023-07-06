package br.com.senaisp.bauru.richard.exercicio;

import java.util.ArrayList;
import java.util.Random;

public class Jogos {
	// constantes
	public static final int TEMPERATURA_BAIXA = 5;
	public static final int TEMPERATURA_ALTA = 45;
	// campos estáticos
	private static int qtdeTemperaturaBaixas = 0;
	private static ArrayList<Jogos> listaJogos = null;
	private static boolean fimTemporada = false;
	private static int qtdeJogos = 0;
	// campos instância
	private int idJogo;
	private double temperatura;
	private Equipe casa;
	private Equipe visitante;
	private int golsCasa;
	private int golsVisitante;

	// constructor é privado para desabilitar o new
	private Jogos() {
		idJogo = ++qtdeJogos;
		temperatura = 0;
		golsCasa = 0;
		golsVisitante = 0;
		casa = null;
		visitante = null;
	}

	// metodos estáticos
	public static void criarJogo(double temp, Equipe[] equipes) {
		if (!fimTemporada) {
			if (temp >= TEMPERATURA_BAIXA && temp <= TEMPERATURA_ALTA) {
				qtdeTemperaturaBaixas = 0;
				Random rnd = new Random();
				// escolhendo o time da casa
				int idTimeCasa = rnd.nextInt(equipes.length);
				int idTimeVisitante;
				do {
					idTimeVisitante = rnd.nextInt(equipes.length);
				} while (idTimeCasa == idTimeVisitante);
				// criar o jogo
				Jogos jogo = new Jogos();
				jogo.temperatura = temp;
				jogo.casa = equipes[idTimeCasa];
				jogo.visitante = equipes[idTimeVisitante];
				// brincando com os gols
				int fatorGols = 1;
				switch ((int) (temp / 10)) {
				case 1 -> fatorGols = 2;
				case 2 -> fatorGols = 3;
				case 3 -> fatorGols = 4;
				case 4 -> fatorGols = 5;
				}
				// atribuindo os gols para casa e para visitantes
				int golsC = rnd.nextInt(fatorGols);
				int golsV = rnd.nextInt(fatorGols);
				jogo.setGolsCasa(golsC);
				jogo.setGolsVisitante(golsV);
				// verificando empates, derrotas e vitorias
				if (golsC > golsV) {
					jogo.casa.addVitorias();
					jogo.visitante.addDerrotas();
				} else if (golsV > golsC) {
					jogo.casa.addDerrotas();
					jogo.visitante.addVitorias();
				} else {
					jogo.casa.addEmpates();
					jogo.visitante.addEmpates();
				}
				// adicionando na lista de jogos
				if (listaJogos == null) {
					listaJogos = new ArrayList<>();
				}
				listaJogos.add(jogo);
			} else {
				System.out.println("Está muito frio ou quente para um jogo!");
				qtdeTemperaturaBaixas++;
			}
			fimTemporada = qtdeTemperaturaBaixas >= 3;
		} else {
			System.out.println("A temporada acabou!!!");
		}
	}

	public int getGolsCasa() {
		return golsCasa;
	}

	public void setGolsCasa(int golsCasa) {
		this.golsCasa = golsCasa;
		try {
			casa.addGolsMarcados(golsCasa);
			visitante.addGolsSofridos(golsCasa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setGolsVisitante(int golsVisitante) {
		this.golsVisitante = golsVisitante;
		try {
			visitante.addGolsMarcados(golsVisitante);
			casa.addGolsSofridos(golsVisitante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getGolsVisitante() {
		return golsVisitante;
	}

	public static ArrayList<Jogos> getListaJogos() {
		return listaJogos;
	}

	public static boolean isFimTemporada() {
		return fimTemporada;
	}

	public int getIdJogo() {
		return idJogo;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public Equipe getCasa() {
		return casa;
	}

	public Equipe getVisitante() {
		return visitante;
	}
	@Override
	public String toString() {
		return "\nJogo #" + idJogo+
			   "\nTemperatura.......: " + temperatura + 
			   "\nJogador Casa......: " + casa.getNome() + " -> " + 
			   		golsCasa +
			   "\nJogador Visitante.: " + visitante.getNome() +
			   		" -> " + golsVisitante;
	}
}
