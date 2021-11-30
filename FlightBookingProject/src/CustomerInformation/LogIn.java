package application;
import javafx.stage.*;

import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ComboBox;
import edu.gsu.common.Action;
import edu.gsu.common.Customer;
import edu.gsu.gui.AccountPage;
import edu.gsu.gui.ExceptionHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;;

public class LogIn extends Application {

	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Welcome");
		
		Label label1 = new Label("Welcome");
		
		//GridPane with 10px padding around edge
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(35,10,10,275));
		grid.setVgap(8);
		grid.setHgap(10);
		
		/* Name label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0, 0);
		*/
		//Name input
		TextField nameInput = new TextField();
		nameInput.setText("Username");
		GridPane.setConstraints(nameInput, 0, 0);
		
		/*Pass label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 1);
		*/
		
		//Password input
		TextField passInput = new TextField();
		passInput.setText("Password");
		GridPane.setConstraints(passInput, 1, 0);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 3, 0);
		//loginButton.setStyle("-fx-background-radius: 5"); <--- to make button more rounded
		
		Button registerButton = new Button("New User");
		GridPane.setConstraints(registerButton, 4, 0);
		registerButton.setOnAction(e -> window.setScene(scene2));
		
		//Registration Layout / Popup
		VBox layout2 = new VBox(20);
		layout2.getChildren().addAll(registerButton);
		scene2 = new Scene(layout2, 500, 500);
		
		//registerButton.setStyle("-fx-background-radius: 5"); <--- to make button more rounded
		
		//Add everything to grid
		grid.getChildren().addAll(/*nameLabel,*/ nameInput, /*passLabel,*/ passInput, loginButton, registerButton);
		
		//Initial scene
		Scene scene = new Scene(grid, 1000, 100);
		scene.getRoot().setStyle("-fx-font-family: 'serif'");
		scene.getRoot().setStyle("-fx-background-color: '#6495ED'");
		window.setScene(scene);
		window.show();
		
	}
	
}
