package textstatistics;

import java.util.Arrays;
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

        Label lettersL = new Label("Letters: 0");
        Label wordsL = new Label("Words: 0");
        Label longestL = new Label("The longest word is: ");
        //String longest =  "";

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            //System.out.println(longest);

            // set values of text elements
            lettersL.setText("Letters: " + String.valueOf(characters));
            wordsL.setText("Words: " + String.valueOf(parts.length));
            longestL.setText("The longest word is: " + longest);
        });

        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(lettersL);
        box.getChildren().add(wordsL);
        box.getChildren().add(longestL);

        layout.setCenter(textArea);

        layout.setBottom(box);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
