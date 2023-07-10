package br.com.senaisp.bauru.richard.classes;

public class EntidadeBase {
	private ConectorBD conn;
	private String nomeTabela;
	private String chavePrimaria;
	private String camposTabela;
	
	public EntidadeBase(ConectorBD con) {
		conn = con;
		nomeTabela = "tabela";
		chavePrimaria = "id";
		camposTabela = "campo";
	}

	public String getNomeTabela() {
		return nomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}

	public String getChavePrimaria() {
		return chavePrimaria;
	}

	public void setChavePrimaria(String chavePrimaria) {
		this.chavePrimaria = chavePrimaria;
	}

	public String getCamposTabela() {
		return camposTabela;
	}

	public void setCamposTabela(String camposTabela) {
		this.camposTabela = camposTabela;
	}
	
	public ConectorBD getConn() {
		return conn;
	}
	
}
