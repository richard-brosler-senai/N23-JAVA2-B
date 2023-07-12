package br.com.senaisp.bauru.richard.licao03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TesteDuke extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		Scene scena = new Scene(root,800,600,Color.BEIGE);
		//criar os componentes
		criarComponentes(root);
		//Setando o titulo e mostrando a janela
		primeiraStage.setTitle("Exemplo de mídias - Duke");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarComponentes(Group root) {
		DukeImg duke = new DukeImg();
		root.getChildren().addAll(duke);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
