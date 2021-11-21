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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ChoiceBox extends Application {
	
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
		button = new Button("Select");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		
		//getItems returns the OberservableList object which you can add items to
		choiceBox.getItems().addAll("-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
		
		//Set default value
		choiceBox.setValue("-");
		
		//To extract selected value
		button.setOnAction(e -> getChoice(choiceBox));

		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(choiceBox, button);
		
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	
	//To get value of the selected item
	private void getChoice(ChoiceBox<String> choiceBox) {
		String month = choiceBox.getValue();
		System.out.print(month);
	}
	
}
