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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BoxChecker extends Application {
	
	Stage window;
	Button button;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Checkbox Example");
		
		//Checkboxes
		CheckBox box1 = new CheckBox("User");
		box1.setSelected(true);
		CheckBox box2 = new CheckBox("Admin");
		
		
		
		//Button
		button = new Button("Select");
		button.setOnAction(e -> handleOptions(box1, box2));
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(box1, box2, button);
		
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	//Handle checkbox options on screen
	private void handleOptions(CheckBox box1, CheckBox box2) {
		String message = "User's order\n";
		
		if (box1.isSelected())
			message += "bacon";
		if (box2.isSelected())
			message += "tuna";
		
		System.out.println(message);
	}
	
}