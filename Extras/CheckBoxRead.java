//Read the values of selected checkbox in JavaFX

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.event.*;

public class CheckBoxRead extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("CheckBox Reading");
		primaryStage.setMinHeight(250);
		primaryStage.setMinWidth(250);
		VBox root = new VBox();
		VBox child = new VBox();
		Label lbl = new Label("Choose your subjects:");
		Button btn = new Button("Submit");
		Label response = new Label();
		lbl.setFont(new Font("Times New Roman", 15));
		response.setWrapText(true);
		response.setFont(new Font("Times New Roman", 15));
		CheckBox chk1 = new CheckBox("PCPI");
		CheckBox chk2 = new CheckBox("OOP");
		CheckBox chk3 = new CheckBox("Web");
		CheckBox chk4 = new CheckBox("ADA");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				String str = "";
				if(chk1.isSelected()) {
					if(str.equals("")) {
						str += chk1.getText();
					}else {
						str += ", " + chk1.getText();
					}
				}
				
				if(chk2.isSelected()) {
					if(str.equals("")) {
						str += chk2.getText();
					}else {
						str += ", " + chk2.getText();
					}
				}
				
				if(chk3.isSelected()) {
					if(str.equals("")) {
						str += chk3.getText();
					}else {
						str += ", " + chk3.getText();
					}
				}
				
				if(chk4.isSelected()) {
					if(str.equals("")) {
						str += chk4.getText();
					}else {
						str += ", " + chk4.getText();
					}
				}
				
				if(str.equals("")) {
					response.setText("No Subject Selected");
				}else {
					response.setText("The Subjects Selected are: " + str);
				}
				
			}
		});
		child.getChildren().addAll(lbl, chk1, chk2, chk3, chk4);
		root.getChildren().addAll(child, btn, response);
		root.setSpacing(8);
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.show();
	}
}