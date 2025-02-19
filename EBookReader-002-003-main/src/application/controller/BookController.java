package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.Library;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class BookController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Label lblBookTitle;
	@FXML
	TextArea txtAreaBookText;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Here");
		
		lblBookTitle.setText(Library.getBooks().get(0).toString());
		txtAreaBookText.setEditable(false);
		txtAreaBookText.setText("Displaying text from the book here ...");			
	}


	@Override
	public void handle(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Library.fxml"));

			Scene scene = new Scene(loader.load());

			Main.stage.setScene(scene);
			Main.stage.show();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
