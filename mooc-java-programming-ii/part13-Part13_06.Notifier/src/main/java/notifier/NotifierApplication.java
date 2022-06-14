package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        TextField leftText = new TextField();
        Button button = new Button("Update");
        Label rightText = new Label();
        

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        VBox componentGroup = new VBox();
        //componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
