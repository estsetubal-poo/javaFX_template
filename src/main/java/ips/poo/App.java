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

               
                MainWindow mainWindow=  new MainWindow();

                // Scene
                Scene scene = new Scene(mainWindow, 400, 300);

                // Stage
                primaryStage.setTitle("JavaFX Example");
                primaryStage.setScene(scene);
                primaryStage.show();
            }




    public static void main(String[] args) {

        launch();
    }

}
