package application;
	
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;



public class FroggerApp extends Application {
	private AnimationTimer timer;
	
	
	
	private Pane root;
	
	private List<Node> cars = new ArrayList<>();
	
	frog = initFrog;
	
	root.getChildren().add(frog);
	
	timer = new AnimationTimer();
		@override 
		
		public void handle(Long now) {
			onupdate();
			
		}
		
	
	
	private Node frog;
	
	
	private Parent createcontent() {
		root = new  Pane();
		root.setprefsize(800,600);
		
		
		
		return root;
		
		
	}
	
	private Node initFrog() {
		Rectangle rect = new Rectangle(38,38,Color.GREEN);
		rect.setTranslateY(600-39);
		
		
	}
	
	
	//size and color will be changed
	private Node spawnCar() {
		Rectangle rect = new Rectangle(40, 40, Color.RED);
		rect.setTranslateY(int)(Math.random()* 14) * 40);	
		
		
	}
	
	
	//THE RATE THAT THE CARS SPAWN
	private void onupdate() {
		for(Node car : cars)
			car.setTranslateX(car.getTranslateX() + Math.random()* 10);
		if(Math.random() < 0.75) {
			cars.add(spawnCar());
			
		}
		//check if the frog is colliding with a car.
		checkstate();
	}
	
	private void checkstate() {
		for(Node car : cars) {
			if(car.getBoundsInParent().intersects(frog.getBoundsInParent()))) {
				frog.setTranslateX(0);
				frog.setTranslateY(600-39);
				return;
			}
		}
		if(frog.getTranslateY() <= 0) {
			timer.stop();
			String win = "you win";
			HBox hBox = new HBox();
			hBox.setTranslateX(350);
			hBox.setTranslateY(250);
			
			
			for(int i = 0; i < win.toCharArray().length; i++) {
				char letter = win.charAt(i);
				
				Text text = new Text(String.valueOf(letter));
				text.setFont(Font.font(48)))
			
				hBox.getChildren().add(text);
				FadeTransition ft = new FadeTransition(Duration.seconds(0.66), text);
				ft.setToValue(1);
				ft.setDelay(Duration.seconds(i * 0.15));
				ft.play();
				
				
			}
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		Stage stage;
		stage.setScene(new Scene(createcontent()));
		
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
