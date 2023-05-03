package StarterScreen;
import java.awt.event.ActionEvent;
import java.io.IOException;

import application.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StarterScreen{
	private TextField usernameField;
	private PasswordField passwordField;
	private Button loginButton;
	private Label label;
	private Stage window;
    public void startingScreen(Stage stage) {
        Pane root = new Pane();
        //root.setStyle("-fx-background-color: BLACK;");
        root.setPrefSize(496.0, 600.0);
        ImageView imageView = new ImageView();
        imageView.setFitWidth(600.0);
        imageView.setFitHeight(600.0);
        imageView.setPreserveRatio(true);
        Image image = new Image("@C:\\Users\\Aashi\\OneDrive\\Documents\\Frogger\\src\\FroggerStartingScreen.png");
        imageView.setImage(image);
        label = new Label();
        label.setLayoutX(14.0);
        label.setLayoutY(419.0);
        label.setPrefWidth(60.0);
        label.setPrefHeight(28.0);
        label.setWrapText(true);
//        label.setTextFill(javafx.scene.paint.Color.web("#0ee899"));
        usernameField = new TextField();
        usernameField.setLayoutX(28.0);
        usernameField.setLayoutY(472.0);
        usernameField.setPromptText("Username");
        usernameField.setText("ewf");
         passwordField = new PasswordField();
        passwordField.setLayoutX(28.0);
        passwordField.setLayoutY(505.0);
        passwordField.setPromptText("Password");
        loginButton = new Button();
        loginButton.setLayoutX(67.0);
        loginButton.setLayoutY(544.0);
        loginButton.setPrefWidth(49.0);
        loginButton.setPrefHeight(18.0);
        loginButton.setText("Log In");
        root.getChildren().addAll(imageView, label, usernameField, passwordField, loginButton);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(usernameField.getText().toString().equals("Player") && passwordField.getText().toString().equals("12345")) {
            label.setText("Success!");
            m.ChangeToScene2();
        }

        else if(usernameField.getText().isEmpty() && passwordField.getText().isEmpty()) {
            label.setText("Please enter your data.");
        }


        else {
            label.setText("Wrong username or password!");
        }
    }


}
