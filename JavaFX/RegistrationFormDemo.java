//Design Registration Form GUI
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.event.*;
import javafx.geometry.*;
import java.time.LocalDate;

public class RegistrationFormDemo extends Application {
    String strData = "";
    Label lblData;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Start the JavaFX application by calling launch().
        launch(args);
    }

    // Override the start() method.
    public void start(Stage myStage) {

        myStage.setTitle("JavaFX Registration Form");
        GridPane rootNode = new GridPane();
        rootNode.setAlignment(Pos.CENTER);
        rootNode.setPadding(new Insets(40, 40, 40, 40));
        rootNode.setVgap(10);
        rootNode.setHgap(10);

        Scene myScene = new Scene(rootNode, 400, 500);
        myStage.setScene(myScene);

        Label lblHdr = new Label("Employee Registration Form");
        lblHdr.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        GridPane.setHalignment(lblHdr, HPos.CENTER);
        GridPane.setMargin(lblHdr, new Insets(20, 0, 20, 0));
        rootNode.add(lblHdr, 0, 0, 2, 1); // column=0, row=0, colspan=2, rowspan=1

        Label lblName = new Label("Enter Your Name: ");
        GridPane.setHalignment(lblName, HPos.RIGHT);
        rootNode.add(lblName, 0, 1); // column=0, row=1
        TextField txtName = new TextField();
        txtName.setPrefColumnCount(20);
        txtName.setPromptText("Enter Your Name");
        rootNode.add(txtName, 1, 1); // column=1, row=1

        Label lblGender = new Label("Select Your Gender: ");
        GridPane.setHalignment(lblGender, HPos.RIGHT);
        rootNode.add(lblGender, 0, 2);
        RadioButton rbMale = new RadioButton("Male");
        RadioButton rbFemale = new RadioButton("Female");

        ToggleGroup tg = new ToggleGroup();
        rbMale.setToggleGroup(tg);
        rbFemale.setToggleGroup(tg);
        rbMale.setSelected(true);

        HBox hb = new HBox(20, rbMale, rbFemale);
        rootNode.add(hb, 1, 2);

        Label lblDob = new Label("Enter Date of Birth: ");
        GridPane.setHalignment(lblDob, HPos.RIGHT);
        rootNode.add(lblDob, 0, 3);
        DatePicker dtPck = new DatePicker(LocalDate.now());
        rootNode.add(dtPck, 1, 3);

        Label lblState = new Label("Select Your State: ");
        GridPane.setHalignment(lblState, HPos.RIGHT);
        rootNode.add(lblState, 0, 4);

        ObservableList<String> stateNames = FXCollections.observableArrayList("Karnataka", "Maharashtra", "Kerala",
                "Tamil Nadu", "Telangana", "Andhra Pradesh");

        ComboBox<String> cbState = new ComboBox<String>(stateNames);
        cbState.setValue("Karnataka");
        rootNode.add(cbState, 1, 4);

        Label lblQualification = new Label("Select Your Qualification: ");
        GridPane.setHalignment(lblQualification, HPos.RIGHT);
        rootNode.add(lblQualification, 0, 5);

        CheckBox cbUG = new CheckBox("UG");
        CheckBox cbPG = new CheckBox("PG");
        CheckBox cbPhD = new CheckBox("PhD");

        HBox hb1 = new HBox(20, cbUG, cbPG, cbPhD);
        rootNode.add(hb1, 1, 5);

        Button btnSubmit = new Button("Register");
        GridPane.setHalignment(btnSubmit, HPos.CENTER);
        GridPane.setMargin(btnSubmit, new Insets(20, 0, 20, 0));
        rootNode.add(btnSubmit, 0, 6, 2, 1);

        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent ae) {
                // TODO Auto-generated method stub
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Registration Successful");
                alert.setHeaderText("Registration Status");
                alert.setContentText("Employee Registration is Successful!!");
                alert.show();
            }
        });

        // Show the stage and its scene.
        myStage.show();
    }
}