//Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Pos;

public class ContextMenuDemo extends Application {
    Label response;

    public static void main(String[] args) {
        // Start the JavaFX application by calling launch().
        launch(args);
    }

    // Override the start() method.
    public void start(Stage myStage) {

        // Give the stage a title.
        myStage.setTitle("Demonstrate Menus");

        // Use a BorderPane for the root node.
        BorderPane rootNode = new BorderPane();

        // Create a scene.
        Scene myScene = new Scene(rootNode, 300, 300);

        // Set the scene on the stage.
        myStage.setScene(myScene);

        // Create a label that will report the selection.
        response = new Label("Menu Demo");

        // Create the menu bar.
        MenuBar mb = new MenuBar();

        // Create the File menu.
        Menu fileMenu = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);

        // Add File menu to the menu bar.
        mb.getMenus().add(fileMenu);

        // Create the Options menu.
        Menu optionsMenu = new Menu("Options");

        // Create the Colors sub-menu.
        Menu colorsMenu = new Menu("Colors");
        MenuItem red = new MenuItem("Red");
        MenuItem green = new MenuItem("Green");
        MenuItem blue = new MenuItem("Blue");

        colorsMenu.getItems().addAll(red, green, blue);
        optionsMenu.getItems().add(colorsMenu);

        // Create the Priority sub-menu.
        Menu priorityMenu = new Menu("Priority");
        MenuItem high = new MenuItem("High");
        MenuItem low = new MenuItem("Low");

        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);

        // Add a separator.
        optionsMenu.getItems().add(new SeparatorMenuItem());

        // Create the Reset menu item.
        MenuItem reset = new MenuItem("Reset");
        optionsMenu.getItems().add(reset);

        // Add Options menu to the menu bar.
        mb.getMenus().add(optionsMenu);

        // Create the Help menu.
        Menu helpMenu = new Menu("Help");
        MenuItem about = new MenuItem("About");
        helpMenu.getItems().add(about);

        // Add Help menu to the menu bar.
        mb.getMenus().add(helpMenu);

        // Create the context menu items
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        // Create a context (i.e., popup) menu that shows edit options.
        final ContextMenu editMenu = new ContextMenu(cut, copy, paste);

        // Create one event handler that will handle menu action events.
        EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                String name = ((MenuItem) ae.getTarget()).getText();
                // If Exit is chosen, the program is terminated.
                if (name.equals("Exit"))
                    Platform.exit();
                response.setText(name + " selected");
            }
        };

        // Set action event handlers for the menu items.
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        red.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);
        about.setOnAction(MEHandler);

        cut.setOnAction(MEHandler);
        copy.setOnAction(MEHandler);
        paste.setOnAction(MEHandler);

        // Create a text field and set its column width to 20.
        TextField tf = new TextField();
        tf.setPrefColumnCount(20);

        // Add the context menu to the textfield.
        tf.setContextMenu(editMenu);

        // Add the menu bar to the top of the border pane and
        // the response label to the center position.
        rootNode.setTop(mb);

        // Create a flow pane that will hold both the response
        // label and the text field.
        FlowPane fpRoot = new FlowPane(10, 10);

        // Center the controls in the scene.
        fpRoot.setAlignment(Pos.CENTER);

        // Add both the label and the text field to the flow pane.
        fpRoot.getChildren().addAll(response, tf);

        // Add the flow pane to the center of the border layout.
        rootNode.setCenter(fpRoot);

        // Show the stage and its scene.
        myStage.show();
    }
}