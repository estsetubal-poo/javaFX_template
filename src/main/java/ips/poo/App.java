package org.example;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

                // Label
                Label label = new Label("Enter your name:");

                // TextField
                TextField textField = new TextField();

                // Circle
                Circle circle = new Circle(40);
                circle.setFill(Color.CORNFLOWERBLUE);

                // Button
                Button button = new Button("Click Me");

                // Event associated with the button
                button.setOnAction(event -> {
                    String name = textField.getText();

                    if (!name.isEmpty()) {
                        label.setText("Hello, " + name + "!");
                        circle.setFill(Color.GREEN);
                    } else {
                        label.setText("Please enter a name.");
                        circle.setFill(Color.RED);
                    }
                });

                // VBox layout
                VBox vbox = new VBox(15);
                vbox.setAlignment(Pos.CENTER);

                // Add components to VBox
                vbox.getChildren().addAll(label, textField, circle, button);

                // Scene
                Scene scene = new Scene(vbox, 400, 300);

                // Stage
                primaryStage.setTitle("JavaFX Example");
                primaryStage.setScene(scene);
                primaryStage.show();
            }




    public static void main(String[] args) {

        launch();
    }

}