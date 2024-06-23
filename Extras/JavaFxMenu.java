//Demonstrate Menu in JavaFx
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxMenu extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane root = new BorderPane();
		MenuBar menu = new MenuBar();
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Options");
		Menu m3 = new Menu("Edit");
		Menu m4 = new Menu("Help");
		menu.getMenus().addAll(m1, m2, m3, m4);
		root.setTop(menu);
		Scene s = new Scene(root);
		arg0.setWidth(500);
		arg0.setTitle("JavaFX Menu");
		arg0.setHeight(500);
		arg0.setScene(s);
		arg0.show();
	}
}