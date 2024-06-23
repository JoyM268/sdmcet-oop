//Reading Values from TextField in JavaFX

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextFieldEvent extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		Label lbl = new Label("Enter your name: ");
		lbl.setFont(new Font("Times New Roman", 15));
		TextField txt = new TextField();
		Label welcome = new Label();
		Button btn = new Button("Submit");
		
		txt.setMaxWidth(100);
		
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				welcome.setText("Welcome " + txt.getText());
				welcome.setFont(new Font("Times New Roman", 15));
			}
		});
		VBox root = new VBox();
		VBox child = new VBox();
		child.getChildren().addAll(lbl, txt);
		child.setSpacing(4);
		root.setSpacing(8);
		root.getChildren().addAll(child, btn, welcome);
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setTitle("TextField Event");
		primaryStage.setMinHeight(250);
		primaryStage.setMinWidth(250);
		primaryStage.show();
	}
}