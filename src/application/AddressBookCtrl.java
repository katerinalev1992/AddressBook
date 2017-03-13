package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddressBookCtrl {
	
	
	// UI Properties
	@FXML
	private TableView<Person> table;
	@FXML
	private TableColumn<Person, String> colFirstName;
	@FXML
	private TableColumn<Person, String> colLastName;
	@FXML
	private TableColumn<Person, String> colSex;
	@FXML
	private TableColumn<Person, String> colEmail;
	@FXML
	private TableColumn<Person, String> colTel;
	@FXML
	private TextField txtFirstName;
	@FXML
	private TextField txtLastName;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtTel;
	@FXML
	private ComboBox<String> cbSex;
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnEdit;
	@FXML
	private Button btnDelete;
	
	// Properties
	private ObservableList<Person> list;
	
	
	// This function is called when the FXML file is loaded.
	@FXML
	public void initialize(){
		
		// Add Option to Combobox
		ObservableList<String> options = FXCollections.observableArrayList();
		options.add("male"); 
		options.add("female"); 
		cbSex.setItems(options);
		
		// Declare the persons information
		list = FXCollections.observableArrayList();
		Person p1 = new Person("John", "Carter", "male", "JohnCarter@gmail.com", "087-5230000");
		Person p2 = new Person("Peter", "Parker", "male", "PeterParker@gmail.com", "082-4840536");
		Person p3 = new Person("Gwen", "Stacy", "female", "GwenStacy@gmail.com", "086-8021030");
		
		// Add person info to list
		list.addAll(p1, p2, p3);
		
		
		// Map TableColumn and Data
		colFirstName.setCellValueFactory(
				new PropertyValueFactory<Person, String>("firstName"));
		colLastName.setCellValueFactory(
				new PropertyValueFactory<Person, String>("lastName"));
		colSex.setCellValueFactory(
				new PropertyValueFactory<Person, String>("sex"));
		colEmail.setCellValueFactory(
				new PropertyValueFactory<Person, String>("email"));
		colTel.setCellValueFactory(
				new PropertyValueFactory<Person, String>("tel"));
		
		// Set the list to table
		table.setItems(list);
	}
	
	
	// Function for Add button
	@FXML
	public void Add(){
		if(isFormFill()){
			String firstName = txtFirstName.getText();
			String lastName = txtLastName.getText();
			String email = txtEmail.getText();
			String tel = txtTel.getText();
			String sex = cbSex.getSelectionModel().getSelectedItem();
			
			Person p = new Person(firstName, lastName, sex, email, tel);
			
			list.add(p);
			clearForm();
		}
		else{
			AlertBox.displayInfo("Please fill the form to add.");
		}
	}
	
	
	// Function for Delete button
	@FXML
	public void Delete(){
		int selectedIndex = table.getSelectionModel().getSelectedIndex();
    	if(selectedIndex == -1){
    		AlertBox.displayInfo("Please select row that you want to delete");
    	}else{
    		Person selectedPerson = table.getSelectionModel().getSelectedItem();
    		list.remove(selectedPerson);
    	}
	}
	
	public boolean isFormFill(){
		boolean fill = false;
		
		String firstName 	= txtFirstName.getText();
		String lastName 	= txtLastName.getText();
		String email 		= txtEmail.getText();
		String tel 			= txtTel.getText();
		int selectIndex 	= cbSex.getSelectionModel().getSelectedIndex();
		
		if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || tel.isEmpty() || selectIndex == -1){
			fill = false;
		}else{
			fill = true;
		}
		
		return fill;
	}
	
	public void clearForm(){
		txtFirstName.clear();
		txtLastName.clear();
		txtEmail.clear();
		txtTel.clear();
		cbSex.getSelectionModel().clearSelection();
	}
}
