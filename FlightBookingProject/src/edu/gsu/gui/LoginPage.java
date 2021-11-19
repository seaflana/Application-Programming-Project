package edu.gsu.gui;

import java.util.HashMap;
import java.util.HashSet;

import edu.gsu.common.Action;
import edu.gsu.common.Customer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;  
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LoginPage extends Application {

  
  
  Button loginButton = new Button("Login");
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    //Button loginButton = new Button("Login");
    TextField userName = new TextField("UserName");
    TextField password = new TextField("Password");

    
    loginButton.setOnAction(e -> login(userName.getText(), password.getText()));
    
    pane.getChildren().addAll(userName, password, loginButton);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 100);
	//scene.getRoot().setStyle("-fx-font-family: 'serif'");
	
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    
    
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
	  

    launch(args);
    
  }
  
  public void login(String userName, String password)  {
	  
	  Customer customer = new Customer();
	  
	  customer.setUserName(userName);
	  customer.setPassword(password);
	  customer.setAction(Action.LOGIN);
	  
	  System.out.println("Customer:" + userName + " " + password);
	  
	  boolean success = ExceptionHandler.process(customer);
	  
	  if (success) {
		  System.out.println("Successful Login!");
		  
		  customer.setAction(Action.GET_FLIGHTS);
		  
		  success = ExceptionHandler.process(customer);
		  
		  if (success) {
	  
			  Stage stage = (Stage) loginButton.getScene().getWindow();
			  
	  
			  stage.close();
		  
			  AccountPage acc = new AccountPage(customer);
			  
			  try {
				  
				  acc.start(new Stage());
				  
				  
			  } catch (Exception e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
			  } 
		  }
	  }
	  
  }
} 
