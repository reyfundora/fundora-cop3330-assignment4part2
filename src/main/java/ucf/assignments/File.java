package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class File {

    public Button AddButton;

    public void runOpen() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptFileOpen.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("Open File");
            popStage.show();


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void AddButtonClicked(ActionEvent actionEvent) {
    }

    public void runSave() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptFileSave.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("Save File");
            popStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void AddButtonClicked2(ActionEvent actionEvent) {
    }
}