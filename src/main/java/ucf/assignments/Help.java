package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.IOException;

public class Help {

    public void RunGettingStarted() {
        // Prompts a pop up with a detailed paragraph on how to use the app
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HelpPromptOne.fxml"));
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
    public void RunAbout() {
        // Click Help > About
        // Prompts a pop up with creator name, school name, class and professor names,
        // and copyright info.

        try {
            Parent root = FXMLLoader.load(getClass().getResource("HelpPromptTwo.fxml"));
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
