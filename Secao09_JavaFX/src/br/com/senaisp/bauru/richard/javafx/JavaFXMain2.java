package br.com.senaisp.bauru.richard.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JavaFXMain2 extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		Scene scena = new Scene(root,800,600);
		//Criando componentes da tela
		criarComponentes(root);
		//configurando a janela
		primeiraStage.setTitle("Olá Mundo!");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarComponentes(Group root) {
		HBox pnlBtns = new HBox();
		//Criando botões do painel HBox
		Button btn1 = new Button("Diga 'Olá Mundo'");
		Button btn2 = new Button("222");
		Button btn3 = new Button("33333");
		//Adicionando os botões ao HBox
		pnlBtns.getChildren().addAll(btn1,btn2,btn3);
		
		//posicionando o painel dos botões
		pnlBtns.setLayoutY(450);
		
		//Adicionando outros itens para o nó root
		Rectangle ret = new Rectangle(250, 250, Color.AQUA);
		ret.setStroke(Color.ORANGE);
		ret.setStrokeType(StrokeType.OUTSIDE);
		ret.setStrokeWidth(10);
		
		//posicionando o retangulo
		ret.setLayoutX(50);
		ret.setLayoutY(50);
		
		//Adicionando um componente Text
		Text txt = new Text("Dorm 6:\n200");
		txt.setFill(Color.RED);
		txt.setFont(Font.font("Arial", FontWeight.BOLD, 32));
		txt.setTextAlignment(TextAlignment.CENTER);
		//colocando o contorno
		txt.setStroke(Color.BLACK);
		txt.setStrokeType(StrokeType.OUTSIDE);
		txt.setStrokeWidth(8);
		txt.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		//posicionando a fonte
		txt.setLayoutX(350);
		txt.setLayoutY(350);
		//Adicionando um ImageView
		
		Image img = new Image("C:\\Users\\sn1069942\\Downloads\\duke.png");
		ImageView imgVw = new ImageView(img);
		
		
		//adicionando o HBox ao nó root
		root.getChildren().addAll(pnlBtns,ret,txt,imgVw);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
