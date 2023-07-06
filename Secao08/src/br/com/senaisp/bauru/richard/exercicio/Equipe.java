package br.com.senaisp.bauru.richard.exercicio;

public class Equipe {
	//campos
	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int golsMarcados;
	private int golsSofridos;
	//constructor
	public Equipe(String pNomeTime) {
		nome = pNomeTime;
		vitorias = 0;
		derrotas = 0;
		empates = 0;
		golsMarcados = 0;
		golsSofridos = 0;
	}
	//getters e setters
	public void addGolsSofridos(int value){
		if (value<0) {
			//esse tipo de Exceção não força tratamento, mas se ocorrer
			//para a aplicação se não tratado!
			throw new RuntimeException("Valor deve ser positivo ou zero!");
		}
		golsSofridos += value;
	}
	
	public void addGolsMarcados(int value) throws Exception {
		if (value<0) {
			throw new Exception("Valor deve ser positivo ou zero!");
		}
		golsMarcados += value;
	}
	
	public void addEmpates() {
		empates++;
	}
	
	public void addDerrotas() {
		derrotas++;
	}
	
	public void addVitorias() {
		vitorias++;
	}
	
	public String getNome() {
		return nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public int getGolsSofridos() {
		return golsSofridos;
	}
	@Override
	public String toString() {
		return "\nEquipe " + nome + 
			   "\nVitórias: " + vitorias + ", " +
				  "Derrotas: " + derrotas + ", " +
			      "Empates: " + empates + 
			   "\nGols marcados: " + golsMarcados + ", "+
			      "Gols sofridos: " + golsSofridos;
	}
}
