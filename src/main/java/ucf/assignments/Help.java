package ucf.assignments;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Help {

    public void runGettingStarted() {
        // Prompts a pop up with a detailed paragraph on how to use the app
        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptTutorial.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("Getting Started!");
            popStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void runAbout() {
        // Prompts a pop up with creator name, school name, class and professor names,
        // and copyright info.

        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptAbout.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("About the App!");
            popStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
