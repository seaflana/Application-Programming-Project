// Needs to be run off of Main or put into Main

package application;
	
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginWindow extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Welcome");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		// Name label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("Ex: seaflana");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Pass label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Password input
		TextField passInput = new TextField();
		passInput.setPromptText("Ex: Whatever123!");
		GridPane.setConstraints(passInput, 1, 1);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		Button registerButton = new Button("New User");
		GridPane.setConstraints(registerButton, 1, 3);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, registerButton);
		
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		window.show();
	}

}