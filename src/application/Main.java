package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	// Declare the window
	private Stage window;
	
	// Declare the root view for the window
	private VBox addressBookView;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		window.setTitle("Address Book");
		window.setResizable(false);
		
		try {
			// Load AddressBookView from FXML file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("AddressBookView.fxml"));
			addressBookView = (VBox) loader.load();
			
			// Show window
			Scene scene = new Scene(addressBookView,700,500);
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
