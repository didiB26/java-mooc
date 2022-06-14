package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {
    
    private String title;
    
    

    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String smth = params.getNamed().get("smth");
        

        window.setTitle(smth);
        window.show();
    }
}