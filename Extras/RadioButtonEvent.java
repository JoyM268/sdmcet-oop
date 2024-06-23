//Read values from radio button

import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.stage.*;
import javafx.event.*;

public class RadioButtonEvent extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		ToggleGroup group = new ToggleGroup();
		Label lbl = new Label("Select your favourite subject:");
		Label response = new Label();
		response.setFont(new Font("Times New Roman", 15));
		Button btn = new Button("Submit");
		lbl.setFont(new Font("Times New Roman", 15));
		RadioButton rdbtn1 = new RadioButton("OOP");
		RadioButton rdbtn2 = new RadioButton("Web");
		RadioButton rdbtn3 = new RadioButton("PCPI");
		RadioButton rdbtn4 = new RadioButton("ADA");
		rdbtn1.setToggleGroup(group);
		rdbtn2.setToggleGroup(group);
		rdbtn3.setToggleGroup(group);
		rdbtn4.setToggleGroup(group);
		VBox root = new VBox();
		VBox child = new VBox();
		child.getChildren().addAll(rdbtn1, rdbtn2, rdbtn3, rdbtn4);
		root.setSpacing(5);
		root.getChildren().addAll(child, btn, response);
		
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				if(rdbtn1.isSelected()) {
					response.setText("Your favourite subject is: " + rdbtn1.getText());
				}else if(rdbtn2.isSelected()) {
					response.setText("Your favourite subject is: " + rdbtn2.getText());
				}else if(rdbtn3.isSelected()) {
					response.setText("Your favourite subject is: " + rdbtn3.getText());
				}else if(rdbtn4.isSelected()) {
					response.setText("Your favourite subject is: " + rdbtn4.getText());
				}else {
					response.setText("Select a subject before submitting");
				}
			}
		});
		
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setMinHeight(250);
		primaryStage.setMinWidth(250);
		primaryStage.setTitle("Radio Button Event");
		primaryStage.show();
	}
}