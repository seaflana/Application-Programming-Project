package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	
	Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantityInput;


	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("TableView Demo");
		
		//Name column
		TableColumn<Product, String> nameColumn = new TableColumn<>("Item Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//Price column
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Item Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		//Quantity column
		TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Item Quantity");
		quantityColumn.setMinWidth(200);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		//Name input
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		//Price input
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		
		//Quantity input
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		
		//Button
		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e -> deleteButtonClicked());
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
					
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table, hBox);

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}
	
	//Add button clicked
	public void addButtonClicked() {
		Product product = new Product();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		table.getItems().add(product);
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
	}
	
	//Delete button clicked
	public void deleteButtonClicked() {
		ObservableList<Product> productSelected, allProducts;
		allProducts = table.getItems();
		productSelected = table.getSelectionModel().getSelectedItems();
		
		productSelected.forEach(allProducts::remove);
	}
	
	//Get all of the products *** THIS WILL USUALLY BE A DATABASE!!!!!
	public ObservableList<Product> getProduct() {
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 859.00, 20));
		products.add(new Product("Bouncy Ball", 2.40, 198));
		products.add(new Product("Toilet", 90.00, 74));
		products.add(new Product("Notebook", 2.51, 12));
		products.add(new Product("Corn", 1.49, 840));
		return products;
	}
	
}








































