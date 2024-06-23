//Demonstrate event handling in JavaFX

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class JavaFxEventDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click me");
		Label lbl = new Label();
		
		//btn.setOnAction(new EventHandler<ActionEvent>() {
		//public void handle(ActionEvent event) {
		//		lbl.setText("You have clicked the button");
		//	}
		//);
		
		btn.setOnAction((event) -> lbl.setText("You have clicked the button"));
		
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setSpacing(5);
		root.getChildren().addAll(btn, lbl);
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setTitle("Button Event");
		primaryStage.setWidth(250);
		primaryStage.setHeight(250);
		primaryStage.show();
	}
}