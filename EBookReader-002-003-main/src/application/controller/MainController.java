package application.controller;

import java.io.File;
import java.io.IOException;
import application.Main;
import application.model.Library;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.stage.DirectoryChooser;

public class MainController implements EventHandler<ActionEvent> {

	@FXML
	private Label lblPathValid;

	@Override
	public void handle(ActionEvent event) {

		// Open directory chooser!
		DirectoryChooser chooser = new DirectoryChooser();

		// Get the directory of library books from the user
		File dir = chooser.showDialog(null);

		// Load the books into the library 
		Library.loadBooks(dir);

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
