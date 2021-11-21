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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ComboBox1 extends Application {
	
	Stage window;
	Button button;
	Scene scene;
	ComboBox<String> comboBox;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ComboBox Demo");
		button = new Button("Submit");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"Good Will Hunting",
				"St. Vincent",
				"Blackhat"
		);
		
		comboBox.setPromptText("What is your favoraite movie?");
		
		comboBox.setEditable(true);
		
		button.setOnAction((e -> printMovie()));
		comboBox.setOnAction( e -> System.out.println("User selected: " + comboBox.getValue()));

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(comboBox, button);
		
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	
	//Print out a movie
	private void printMovie() {
		System.out.println(comboBox.getValue());
	}
	
	
}