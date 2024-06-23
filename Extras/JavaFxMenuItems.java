//Menu Items in JavaFx
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxMenuItems extends Application{
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
		
		MenuItem m11 = new MenuItem("New");
		MenuItem m12 = new MenuItem("Open");
		MenuItem m13 = new MenuItem("Save");
		MenuItem m14 = new MenuItem("Close");
		m1.getItems().addAll(m11, m12, m13, m14);
		
		MenuItem m21 = new MenuItem("Run");
		MenuItem m22 = new MenuItem("Debug");
		m2.getItems().addAll(m21, m22);
		
		MenuItem m31 = new MenuItem("Copy");
		MenuItem m32 = new MenuItem("Paste");
		MenuItem m33 = new MenuItem("Cut");
		m3.getItems().addAll(m31, m32, m33);
		
		MenuItem m41 = new MenuItem("About");
		MenuItem m42 = new MenuItem("Close");
		m4.getItems().addAll(m41, m42);
		
		
		menu.getMenus().addAll(m1, m2, m3, m4);
		root.setTop(menu);
		Scene s = new Scene(root);
		arg0.setWidth(500);
		arg0.setHeight(500);
		arg0.setTitle("JavaFX MenuItems");
		arg0.setScene(s);
		arg0.show();
	}
}