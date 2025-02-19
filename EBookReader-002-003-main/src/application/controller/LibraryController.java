package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.EBook;
import application.model.Library;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


public class LibraryController implements EventHandler<ActionEvent>, Initializable {	

	@FXML
	AnchorPane anchorPaneRoot;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// TODO: add buttons to the Library view
		//		1. add an ID to the AnchorPane
		//      2. for each book, create a Button and set the button location, text and onAction method
		//      3. add the button to the view

		int i = 0;
		for(EBook book : Library.getBooks()) {
			i = i + 50;
			Button b = new Button();
			b.setText(book.toString());
			b.setLayoutX(100);
			b.setLayoutY(100 + i );
			
			// Use Anonymous inner class to add event handler 
			b.setOnAction(  new EventHandler<ActionEvent>()  {
									@Override
									public void handle(ActionEvent event) {
										// replace by code to call open the view, need a way to pass the "book-button" to the next view
										try {

											FXMLLoader loader = new FXMLLoader();
											loader.setLocation(getClass().getResource("../view/Book.fxml"));

											Scene scene = new Scene(loader.load());

											Main.stage.setScene(scene);
											Main.stage.show();

										} catch (IOException e) {

											e.printStackTrace();
										}
									}
							}            
			              );
			
			anchorPaneRoot.getChildren().add(b);
		
		} // end for loop
	} // end initialize()

	// TODO: add a "back to library selection" button
	@Override
	public void handle(ActionEvent event) {
				
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Main.fxml"));

			Scene scene = new Scene(loader.load());

			Main.stage.setScene(scene);
			Main.stage.show();

		} catch (IOException e) {

			e.printStackTrace();
		}
	
	}

}
