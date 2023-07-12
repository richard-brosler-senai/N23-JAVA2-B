package br.com.senaisp.bauru.richard.licao03;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class DukeImg extends Group {
	//campos de instância
	private Image dukeImagem;
	private Image luvaImagem;
	private ImageView dukeVw;
	private ImageView luvaVw;
	private AudioClip audio;
	
	public DukeImg() {
		dukeImagem = new Image(getClass()
				.getResource("Images/Duke.png").toString());
		
		luvaImagem = new Image(getClass()
				.getResource("Images/Glove.png").toString());
		
		audio = new AudioClip(getClass()
				.getResource("Audios/Note5.wav").toString());
		
		dukeVw = new ImageView(dukeImagem);
		luvaVw = new ImageView(luvaImagem);
		
		luvaVw.setFitWidth(35);
		luvaVw.setPreserveRatio(true);
		luvaVw.setX(10);
		
		dukeVw.setY(10);
		
		getChildren().addAll(dukeVw,luvaVw);
		
		adicionandoEventos();
	}

	private void adicionandoEventos() {
		//criando os eventos
		setOnMouseClicked((evt)->{
			audio.play();
		});
		//Evento de captura de clicar e arrastar componente
		setOnMouseDragged((evt)->{
			//obtendo o tamanho do group e dividindo por 2 (centro)
			double comp = this.getBoundsInLocal().getWidth()/2;
			double larg = this.getBoundsInLocal().getHeight()/2;
			//reposicionando o grupo na Scene
			setLayoutX(evt.getSceneX()-comp);
			setLayoutY(evt.getSceneY()-larg);
		});
	}
}
