//Sub Menu in JavaFX

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxSubMenu extends Application{
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
		
		Menu m11 = new Menu("New");
		MenuItem m12 = new MenuItem("Open");
		Menu m13 = new Menu("Save");
		MenuItem m14 = new MenuItem("Close");
		m1.getItems().addAll(m11, m12, m13, m14);
		
		Menu m21 = new Menu("Run");
		MenuItem m22 = new MenuItem("Debug");
		m2.getItems().addAll(m21, m22);
		
		MenuItem m31 = new MenuItem("Copy");
		MenuItem m32 = new MenuItem("Paste");
		MenuItem m33 = new MenuItem("Cut");
		m3.getItems().addAll(m31, m32, m33);
		
		MenuItem m41 = new MenuItem("About");
		MenuItem m42 = new MenuItem("Close");
		m4.getItems().addAll(m41, m42);
		
		MenuItem m111 = new MenuItem("Project");
		MenuItem m112 = new MenuItem("Java Project");
		MenuItem m113 = new MenuItem("Class");
		m11.getItems().addAll(m111, m112, m113);
		
		MenuItem m211 = new MenuItem("Run as application");
		MenuItem m212 = new MenuItem("Run on server");
		m21.getItems().addAll(m211, m212);

		MenuItem m131 = new MenuItem("Save as word");
		MenuItem m132 = new MenuItem("Save as PDF");
		m13.getItems().addAll(m131, m132);
		
		menu.getMenus().addAll(m1, m2, m3, m4);
		root.setTop(menu);
		Scene s = new Scene(root);
		arg0.setWidth(500);
		arg0.setHeight(500);
		arg0.setTitle("JavaFX Sub Menu");
		arg0.setScene(s);
		arg0.show();
	}
}