package  ips.poo.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import ips.poo.model.SystemInfo;

public class MainWindow extends BorderPane {

    public MainWindow() {
        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();
        Button button = new Button("Click Me");
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        
        // inicialmente invisível
        label.setVisible(false);

        // ação do botão
        button.setOnAction(e -> {
            label.setVisible(true);
        });
          setTop(label);
          setCenter(button);
    }
}
