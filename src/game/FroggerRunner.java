package game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FroggerRunner extends Application {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
        GameBoard gameBoard = new GameBoard();
        Scene scene = new Scene(gameBoard);

        primaryStage.setTitle("Frogger");
        primaryStage.setScene(scene);
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}