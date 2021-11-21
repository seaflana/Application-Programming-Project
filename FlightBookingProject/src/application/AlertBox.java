package application;
import javafx.stage.*;

import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

	public static void display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label("Text");
		label.setText(message);
		Button closeButton = new Button("Return");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox();
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 100, 50);
		window.setScene(scene);
		window.showAndWait();
	}
	
}
