package br.com.senaisp.bauru.richard.javafx;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ExemploPoligonos extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		Scene scena = new Scene(root,800,600,Color.BLACK);
		//Criando os componentes
		criadorComponentes(root);
		//Ajustando o título
		primeiraStage.setTitle("Exemplo de polígonos e cores");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criadorComponentes(Group root) {
		//Criando um triângulo
		Polygon pol = new Polygon(new double[] {
				50.0,  150.0,
				200.0, 150.0,
				200.0,  50.0
		});
		//Criando um círculo
		Circle circulo = new Circle(100);
		//Criando um gradiente linear           xi,yi,xf,yf
		LinearGradient lngr = new LinearGradient(0, 0, 1, 0, 
				true, CycleMethod.NO_CYCLE, new Stop[] {
						new Stop(0,Color.BLACK),
						new Stop(0.5,Color.RED),
						new Stop(1,Color.BLUE)
				});
		
		RadialGradient rdgr = new RadialGradient(0, 0, .5, .5, .5, 
				true, CycleMethod.NO_CYCLE, new Stop[] {
						new Stop(0,Color.BLUE),
						new Stop(1,Color.WHITE)
				});
		
		pol.setFill(lngr);
		circulo.setFill(rdgr);
		//posicionando o circulo no group
		circulo.setLayoutX(400);
		circulo.setLayoutY(200);
		//adicionando os componentes no nó root
		root.getChildren().addAll(pol,circulo);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
