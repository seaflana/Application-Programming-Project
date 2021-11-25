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

public class Registration extends Application {

	Stage window;
	Scene scene1, scene2;
	BorderPane layout;
	
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
		grid.setPadding(new Insets(35, 10, 10, 75));
		grid.setVgap(8);
		grid.setHgap(10);

		
		//First Name input
		TextField firstNameInput = new TextField();
		firstNameInput.setText("First Name");
		GridPane.setConstraints(firstNameInput, 0, 0);
		
		//Last Name input
		TextField lastNameInput = new TextField();
		lastNameInput.setText("Last Name");
		GridPane.setConstraints(lastNameInput, 0, 1);
		
		//Username input
		TextField usernameInput = new TextField();
		usernameInput.setText("Username");
		GridPane.setConstraints(usernameInput, 0, 2);
		
		//Password input
		TextField passwordInput = new TextField();
		passwordInput.setText("Password");
		GridPane.setConstraints(passwordInput, 0, 3);
		
		//Address input
		TextField addressInput = new TextField();
		addressInput.setText("Address");
		GridPane.setConstraints(addressInput, 0, 4);
		
		//Zipcode input
		TextField zipcodeInput = new TextField();
		zipcodeInput.setText("Zipcode");
		GridPane.setConstraints(zipcodeInput, 0, 5);
		
		//State input
		TextField stateInput = new TextField();
		stateInput.setText("Two-digit State Code");
		GridPane.setConstraints(stateInput, 0, 6);
		
		//Email input
		TextField emailInput = new TextField();
		emailInput.setText("Email");
		GridPane.setConstraints(emailInput, 0, 7);
		
		//SSN input
		TextField ssnInput = new TextField();
		ssnInput.setText("SSN");
		GridPane.setConstraints(ssnInput, 0, 8);
		
		//Security Question
		TextField securityQuestionInput = new TextField();
		securityQuestionInput.setText("Security Question");
		GridPane.setConstraints(securityQuestionInput, 0, 9);
		
		//Security Answer
		TextField securityAnswerInput = new TextField();
		securityAnswerInput.setText("Security Answer");
		GridPane.setConstraints(securityAnswerInput, 0, 10);


		//Submit Button
		Button submitButton = new Button("Submit");
		GridPane.setConstraints(submitButton, 0, 12);
		submitButton.setOnAction(e -> login(firstNameInput.getText(), lastNameInput.getText(), usernameInput.getText(), passwordInput.getText(),
				addressInput.getText(), zipcodeInput.getText(), stateInput.getText(), emailInput.getText(), ssnInput.getText(), securityQuestionInput.getText(),
				securityAnswerInput.getText()));
		
		//Return to Login Button
		Button returnToLoginButton = new Button("Return to Login");
		GridPane.setConstraints(returnToLoginButton, 0, 13);

		
		//Add everything to grid
		grid.getChildren().addAll(firstNameInput, lastNameInput, usernameInput, passwordInput, addressInput, zipcodeInput, stateInput, emailInput,
				ssnInput, securityQuestionInput, securityAnswerInput, submitButton, returnToLoginButton);
		
		//Initial scene
		layout = new BorderPane();
		Scene scene = new Scene(grid, 750, 500);
		scene.getRoot().setStyle("-fx-font-family: 'serif'");
		scene.getRoot().setStyle("-fx-background-color: '#6495ED'");
		window.setScene(scene);
		window.show();
		
	}
	
	//New Customer object creation
	 public void login(String firstName, String lastName, String username, String password, String address, String zipcode, String state, String email, String ssn,
			 String securityQuestion, String securityAnswer)  {
		  
		  Customer customer = new Customer();
		  
		  customer.setFirstName(firstName);
		  customer.setUsername(username);
		  customer.setPassword(password);
		  customer.setAddress(address);
		  customer.setZipcode(zipcode);
		  customer.setState(state);
		  customer.setEmail(email);
		  customer.setSsn(ssn);
		  customer.setSecurityQuestion(securityQuestion);
		  customer.setSecurityAnswer(securityAnswer);
		  
		  System.out.println("Customer:" + username + " " + password);
	 }
	
}