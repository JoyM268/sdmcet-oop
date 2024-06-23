//Demo of JavaFX
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Button btn = new Button("Click me");
		HBox root = new HBox();
		root.getChildren().add(btn);
		Scene sc = new Scene(root);
		arg0.setScene(sc);
		arg0.setTitle("JavaFX Demo");
		arg0.setWidth(250);
		arg0.setHeight(250);
		//arg0.setFullScreen(true);
		arg0.show();
	}
}