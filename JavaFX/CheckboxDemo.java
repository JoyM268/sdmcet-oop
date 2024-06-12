//Demonstrate Check Boxes.
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckboxDemo extends Application {
    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;
    Label response;
    Label allTargets;
    String targets = "";

    public static void main(String[] args) {
        // Start the JavaFX application by calling launch().
        launch(args);
    }

    // Override the start() method.
    public void start(Stage myStage) {

        // Give the stage a title.
        myStage.setTitle("Demonstrate Checkboxes");

        // Use a FlowPane for the root node. In this case,
        // vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene.
        Scene myScene = new Scene(rootNode, 230, 140);

        // Set the scene on the stage.
        myStage.setScene(myScene);
        Label heading = new Label("Select Deployment Options");

        // Create a label that will report the state of the
        // selected check box.
        response = new Label("No Deployment Selected");

        // Create a label that will report all targets selected.
        allTargets = new Label("Target List: <none>");

        // Create the check boxes.
        cbWeb = new CheckBox("Web");
        cbDesktop = new CheckBox("Desktop");
        cbMobile = new CheckBox("Mobile");

        // Handle action events for the check boxes.
        cbWeb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbWeb.isSelected())
                    response.setText("Web deployment selected.");
                else
                    response.setText("Web deployment cleared.");
                showAll();
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbDesktop.isSelected())
                    response.setText("Desktop deployment selected.");
                else
                    response.setText("Desktop deployment cleared.");
                showAll();
            }
        });
        cbMobile.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbMobile.isSelected())
                    response.setText("Mobile deployment selected.");
                else
                    response.setText("Mobile deployment cleared.");
                showAll();
            }
        });

        // Use a separator to better organize the layout.
        Separator separator = new Separator();
        separator.setPrefWidth(200);

        // Add controls to the scene graph.
        rootNode.getChildren().addAll(heading, separator, cbWeb, cbDesktop, cbMobile, response, allTargets);

        // Show the stage and its scene.
        myStage.show();
    }

    // Update and show the targets list.
    void showAll() {
        targets = "";
        if (cbWeb.isSelected())
            targets = "Web ";
        if (cbDesktop.isSelected())
            targets += "Desktop ";
        if (cbMobile.isSelected())
            targets += "Mobile";
        if (targets.equals(""))
            targets = "<none>";
        allTargets.setText("Target List: " + targets);
    }
}