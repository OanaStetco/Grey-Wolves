package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// Load root layout from fxml file.
			 Parent root = FXMLLoader.load(getClass().getResource("/view/Grey Wolves.fxml"));
			//rootLayout = loader.load();

			// Show the scene containing the root layout.
			//Scene scene = new Scene(rootLayout);
			primaryStage.setTitle("Grey Wolves");
			primaryStage.setScene( new Scene(root));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
