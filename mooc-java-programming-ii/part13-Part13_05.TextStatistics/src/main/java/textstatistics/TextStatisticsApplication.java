package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Label("Letters: 0"));
        buttons.getChildren().add(new Label("Words: 0"));
        buttons.getChildren().add(new Label("The longest word is:"));

        layout.setCenter(textArea);
        
        layout.setBottom(buttons);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}