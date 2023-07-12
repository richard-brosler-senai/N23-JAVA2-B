package br.com.senaisp.bauru.richard.licao03;

import java.util.HashMap;

import javafx.scene.Scene;

public class ControladorTelas {
	private HashMap<String, Scene> telas;
	private HashMap<String, String> titulosMenu;
	
	private static ControladorTelas instancia = null;
	
	private ControladorTelas() {
		telas = new HashMap<>();
		titulosMenu = new HashMap<>();
	}
	//método para obter o controlador (singleton)
	public static ControladorTelas getInstancia() {
		if (instancia == null) {
			instancia = new ControladorTelas();
		}
		return instancia;
	}
	
	public void addTela(Scene tela, String chave, String titulo) {
		//adicionando a tela no controle de telas usando a chave
		telas.put(chave, tela);
		//adicionando os titulos
		titulosMenu.put(chave, titulo);
	}
	
	public Scene getScena(String chave) {
		Scene ret = null;
		if (telas.containsKey(chave)) {
			ret = telas.get(chave);
		} else {
			throw new 
				RuntimeException("Chave de tela não encontrada!");
		}
		return ret;
	}
	
	public String getTitulo(String chave) {
		String ret = null;
		if (titulosMenu.containsKey(chave)) {
			ret = titulosMenu.get(chave);
		} else {
			throw new 
			RuntimeException("Chave de tela não encontrada!");
		}
		return ret;
	}
}
