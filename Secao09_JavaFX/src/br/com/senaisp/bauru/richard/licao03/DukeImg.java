package br.com.senaisp.bauru.richard.licao03;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DukeImg extends Group {
	private Image dukeImagem;
	private Image luvaImagem;
	private ImageView dukeVw;
	private ImageView luvaVw;
	
	public DukeImg() {
		dukeImagem = new Image(getClass()
				.getResource("Images/Duke.png").toString());
		
		luvaImagem = new Image(getClass()
				.getResource("Images/Glove.png").toString());
		
		dukeVw = new ImageView(dukeImagem);
		luvaVw = new ImageView(luvaImagem);
		
		getChildren().addAll(dukeVw,luvaVw);
	}
}
