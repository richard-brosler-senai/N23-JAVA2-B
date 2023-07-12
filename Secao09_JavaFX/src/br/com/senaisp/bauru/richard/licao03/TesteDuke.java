package br.com.senaisp.bauru.richard.licao03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TesteDuke extends Application {
	private static final String chavePrincipal = "TelaPrincipal";
	@Override
	public void start(Stage primeiraStage) throws Exception {
		
		ControladorTelas controle = ControladorTelas.getInstancia();
		
		Group root = new Group();
		Scene scena = new Scene(root,800,600,Color.BEIGE);
		
		controle.addTela(scena, chavePrincipal, "Tela Principal");
		
		//criar os componentes
		criarComponentes(root);
		//Setando o titulo e mostrando a janela
		primeiraStage.setTitle("Exemplo de mídias - Duke");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarComponentes(Group root) {
		DukeImg duke = new DukeImg();
		DukeImg duke1 = new DukeImg();
		DukeImg duke2 = new DukeImg();
		
		duke.setLayoutX(50);
		duke.setLayoutY(50);
		
		duke1.setLayoutX(100);
		duke1.setLayoutY(50);
		
		duke2.setLayoutX(150);
		duke2.setLayoutY(50);
		
		root.getChildren().addAll(duke, duke1, duke2);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
