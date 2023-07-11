package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		//Criando o painel principal da tela
		//Esse componente é uma pilha de componentes
		//StackPane root = new StackPane();
		//Esse componente é um painel que se ajusta
		//FlowPane root = new FlowPane();
		//Exemplo com tilepane
		TilePane root = new TilePane();
		//Exemplo com VBox
		//VBox root = new VBox();
		//Usando o group
		//Group root = new Group();
		//Montando a janela da aplicação
		Scene scena = new Scene(root,800,600);
		//Criando os objetos da janela
		Button btn = new Button();
		btn.setText("Diga 'Olá mundo!'");
		
		btn.setLayoutY(100); //posicionando na Y = 100
		
		Button btn2 = new Button("1111");
		Button btn3 = new Button("33");
		
		//colocar ação no botão
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Olá mundo!");
			}
		});
		//
		root.getChildren().addAll(btn,btn2,btn3);
		//Configurando a stage
		primeiraStage.setTitle("Sou o título da janela");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
