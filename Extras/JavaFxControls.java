//Different JavaFx Controls
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFxControls extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		VBox root = new VBox();
		root.setSpacing(10);
		Label l = new Label("Diffrent Controls in JavaFX:");
		l.setFont(new Font("Times New Roman", 30));
		root.getChildren().add(l);
		VBox sub1 = new VBox();
		VBox sub2 = new VBox();
		VBox sub3 = new VBox();
		VBox sub4 = new VBox();
		VBox sub5 = new VBox();
		VBox sub6 = new VBox();
		VBox sub7 = new VBox();
		VBox sub8 = new VBox();
		VBox sub9 = new VBox();
		sub1.setSpacing(2);
		sub2.setSpacing(2);
		sub3.setSpacing(2);
		sub4.setSpacing(2);
		sub5.setSpacing(2);
		sub6.setSpacing(2);
		sub7.setSpacing(2);
		sub8.setSpacing(2);
		sub9.setSpacing(2);
		root.getChildren().add(sub1);
		root.getChildren().add(sub2);
		root.getChildren().add(sub3);
		root.getChildren().add(sub4);
		root.getChildren().add(sub5);
		root.getChildren().add(sub6);
		root.getChildren().add(sub7);
		root.getChildren().add(sub8);
		root.getChildren().add(sub9);
		
		//Button
		Label l1 = new Label("Button:");
		l1.setFont(new Font("Times New Roman", 20));
		Button btn = new Button("Button");
		//btn.setText("New Text");
		//btn.setWrapText(true);
		//btn.setDisable(true);
		sub1.getChildren().add(l1);
		sub1.getChildren().add(btn);
		
		//Radio Button
		ToggleGroup t = new ToggleGroup();
		Label l2 = new Label("Radio Button:");
		RadioButton rdbtn1 = new RadioButton("First");
		RadioButton rdbtn2 = new RadioButton("Second");
		RadioButton rdbtn3 = new RadioButton("Third");
		rdbtn1.setToggleGroup(t);
		rdbtn2.setToggleGroup(t);
		rdbtn3.setToggleGroup(t);
		l2.setFont(new Font("Times New Roman", 20));
		sub2.getChildren().addAll(l2, rdbtn1, rdbtn2, rdbtn3);
		
		//CheckBox
		Label l3 = new Label("CheckBox:");
		l3.setFont(new Font("Times New Roman", 20));
		CheckBox chk1 = new CheckBox("First");
		CheckBox chk2 = new CheckBox("Second");
		CheckBox chk3 = new CheckBox("Third");
		sub3.getChildren().addAll(l3, chk1, chk2, chk3);
		
		//Hyperlink
		Label l4 = new Label("Hyberlink:");
		l4.setFont(new Font("Times New Roman", 20));
		Hyperlink h = new Hyperlink("https://github.com/JoyM268/sdmcet-oop/tree/main/JavaFX");
		sub4.getChildren().addAll(l4, h);
		
		//Combo Box
		Label l5 = new Label("ComboBox:");
		l5.setFont(new Font("Times New Roman", 20));
		ComboBox<String> box = new ComboBox<String>();
		box.getItems().addAll("Option 1", "Option 2", "Option 3");
		sub5.getChildren().addAll(l5, box);
		
		//TextField
		Label l6 = new Label("TextField:");
		l6.setFont(new Font("Times New Roman", 20));
		TextField text = new TextField();
		text.setMaxWidth(300);
		sub6.getChildren().addAll(l6, text);
		
		//PasswordField
		Label l7 = new Label("PasswordField:");
		l7.setFont(new Font("Times New Roman", 20));
		PasswordField pass = new PasswordField();
		pass.setMaxWidth(300);
		sub7.getChildren().addAll(l7, pass);
		
		//ListView
		Label l8 = new Label("ListView:");
		l8.setFont(new Font("Times New Roman", 20));
		ListView<String> lv = new ListView<>();
		lv.getItems().addAll("One", "Two", "Three", "Four", "Five");
		sub8.getChildren().addAll(l8, lv);
		
		//Date Picker
		Label l9 = new Label("Date Picker:");
		l9.setFont(new Font("Times New Roman", 20));
		DatePicker date = new DatePicker();
		sub9.getChildren().addAll(l9, date);
		
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.setTitle("JavaFX Controls");
		primaryStage.setWidth(500);
		primaryStage.setHeight(800);
		primaryStage.show();
	}
}