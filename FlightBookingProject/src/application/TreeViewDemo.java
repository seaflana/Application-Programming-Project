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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.GridPane;

public class TreeViewDemo extends Application {
	
	Stage window;
	TreeView<String> tree;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("TreeView Demo");
		
		TreeItem<String> root, bucky, Megan;
		
		//Root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//Bucky
		bucky = makeBranch("Bucky", root);
		makeBranch("thenewboston", bucky);
		makeBranch("youtube", bucky);
		makeBranch("chicken", bucky);
		
		//Megan
		Megan = makeBranch("Megan", root);
		makeBranch("glitter", Megan);
		makeBranch("makeup", Megan);
		makeBranch("purses", Megan);
		
		//Create tree ** the false here is used to get rid of an extra tab at the top that is basically useless
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> {
					if(newValue != null)
						System.out.println(newValue.getValue());
				});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	
	//Create branches
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
}






















