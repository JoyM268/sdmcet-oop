//Different Layouts in JavaFX
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxLayouts extends Application{
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage arg0) throws Exception {
		Button btn1 = new Button("Click me");
		Button btn2 = new Button("Click me");
		Button btn3 = new Button("Click me");
		Button btn4 = new Button("Click me");
		Button btn5 = new Button("Click me");
		Button btn6 = new Button("Click me");	
		Button btn7 = new Button("Click me");
		Button btn8 = new Button("Click me");
		Button btn9 = new Button("Click me");
		Button btn10 = new Button("Click me");
		Button btn11 = new Button("Click me");
		Button btn12 = new Button("Click me");
		Button btn13 = new Button("Click me");
		
		//HBox root = new HBox();
		//root.getChildren().add(btn1);
		//root.getChildren().add(btn2);
		//root.getChildren().add(btn3);
		//root.getChildren().add(btn4);
		//root.getChildren().add(btn5);
		//root.getChildren().add(btn6);
		//root.getChildren().add(btn7);
		//root.getChildren().add(btn8);
		//root.getChildren().add(btn9);
		//root.getChildren().add(btn10);
		//root.getChildren().add(btn11);
		//root.getChildren().add(btn12);
		//root.getChildren().add(btn13);
		//root.setSpacing(20);
		
		//VBox root = new VBox();
		//root.getChildren().add(btn1);
		//root.getChildren().add(btn2);
		//root.getChildren().add(btn3);
		//root.getChildren().add(btn4);
		//root.getChildren().add(btn5);
		//root.getChildren().add(btn6);
		//root.getChildren().add(btn7);
		//root.getChildren().add(btn8);
		//root.getChildren().add(btn9);
		//root.getChildren().add(btn10);
		//root.getChildren().add(btn11);
		//root.getChildren().add(btn12);
		//root.getChildren().add(btn13);
		//root.setSpacing(20);
		
		//FlowPane root = new FlowPane();
		//root.getChildren().add(btn1);
		//root.getChildren().add(btn2);
		//root.getChildren().add(btn3);
		//root.getChildren().add(btn4);
		//root.getChildren().add(btn5);
		//root.getChildren().add(btn6);
		//root.getChildren().add(btn7);
		//root.getChildren().add(btn8);
		//root.getChildren().add(btn9);
		//root.getChildren().add(btn10);
		//root.getChildren().add(btn11);
		//root.getChildren().add(btn12);
		//root.getChildren().add(btn13);
		
		//GridPane root = new GridPane();
		//root.add(btn1, 0, 0);
		//root.add(btn2, 1, 1);
		//root.add(btn3, 2, 2);
		//root.setGridLinesVisible(true);
		//root.setVgap(20);
		//root.setHgap(20);
		
		//BorderPane root = new BorderPane();
		//root.setTop(btn1);
		//root.setBottom(btn2);
		//root.setCenter(btn3);
		//root.setRight(btn4);
		//root.setLeft(btn5);
		
		StackPane root = new StackPane();
		btn1.setMaxHeight(100);
		btn1.setMaxWidth(100);
		root.getChildren().add(btn1);
		root.getChildren().add(btn2);
		
		
		Scene sc = new Scene(root);
		
		arg0.setScene(sc);
		arg0.setTitle("JavaFX Layouts");
		arg0.setWidth(500);
		arg0.setHeight(500);
		arg0.show();
	}
}