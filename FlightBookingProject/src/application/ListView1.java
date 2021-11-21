package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ListView1 extends Application {
	
	Stage window;
	Button button;
	Scene scene;
	ListView<String> listView;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ListView Demo");
		button = new Button("Submit");

		listView = new ListView<>();
		listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		button.setOnAction(e -> buttonClicked());
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(listView, button);
		
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	
	//Print out movies
	private void buttonClicked() {
		String message = "";
		ObservableList<String> movies;
		movies = listView.getSelectionModel().getSelectedItems();
		
		for(String m: movies) {
			message += m + "\n";
		}
		
		System.out.println(message);
	}
	
}




























