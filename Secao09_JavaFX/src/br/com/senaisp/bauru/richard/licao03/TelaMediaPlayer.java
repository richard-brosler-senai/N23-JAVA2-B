package br.com.senaisp.bauru.richard.licao03;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;

public class TelaMediaPlayer extends Group {
	private ControladorTelas controle;
	
	private Scene scena;
	private Media arqVideo;
	private MediaPlayer mediaPlayer;
	private MediaView mediaVw;
	
	public TelaMediaPlayer() {
		controle = ControladorTelas.getInstancia();
		
		scena = new Scene(this,800,600,Color.BEIGE);
		controle.addTela(scena, "TelaMediaPlayer", "Tela de Mídia");
		
		arqVideo = new Media("https://www.gov.br/plataformamaisbrasil/pt-br/noticias-e-eventos/eventos/apresentacoes-de-eventos/2019/apresentacoes-iv-forum-nacional-das-transferencias-da-uniao/industria_4-0_-_senai.mp4/@@download/file/Industria_4.0_-_SENAI.mp4");
		mediaPlayer = new MediaPlayer(arqVideo);
		mediaVw = new MediaView(mediaPlayer);
		
		mediaVw.setFitWidth(600);
		mediaVw.setFitHeight(400);
		mediaVw.setPreserveRatio(true);
		
		mediaVw.setX(100);
		mediaVw.setY(50);
		
		VBox pnlBtns = new VBox();
		
		Button btnPlay = new Button("Play");
		Button btnStop = new Button("Stop");
		Button btnPause = new Button("Pause");
		
		VBox.setVgrow(btnPlay, Priority.ALWAYS);
		VBox.setVgrow(btnStop, Priority.ALWAYS);
		VBox.setVgrow(btnPause, Priority.ALWAYS);
		
		btnPlay.setPrefWidth(600);
		btnPause.setPrefWidth(600);
		btnStop.setPrefWidth(600);
		
		btnPlay.setOnAction((evt)->{
			mediaPlayer.play();
		});
		
		btnStop.setOnAction((evt)->{
			mediaPlayer.stop();
		});
		
		btnPause.setOnAction((evt)->{
			mediaPlayer.pause();
		});
		
		pnlBtns.getChildren().addAll(btnPlay,btnStop,btnPause);
		pnlBtns.setPrefWidth(600);
		pnlBtns.setSpacing(10);
		pnlBtns.setLayoutY(460);
		pnlBtns.setLayoutX(100);
		
		getChildren().addAll(mediaVw,pnlBtns);
	}
}
