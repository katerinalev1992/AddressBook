package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



public class AlertBox {

    
    public static void displayInfo(String message) {
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Info");
    	alert.setHeaderText(null);
    	alert.setContentText(message);

    	alert.showAndWait();
    }

}
