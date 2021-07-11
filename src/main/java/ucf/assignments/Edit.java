package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Edit {
    public DatePicker AddDate;
    public TextArea AddDescription;

    // Prompt asking for description and date of item
    public void runEditNew() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptNewItem.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("New Item!");
            popStage.setResizable(false);
            popStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    // After clicking 'add' in runEditNew popup window
    public void AddButtonClicked(ActionEvent actionEvent) {
        DatePicker date = AddDate;
        TextArea description = AddDescription;


    }

    public void runEditDelete() {
        // Prompt the name of the List where you want to add the item
        // int item_count = 0
        // item_count++
        // Create Hash Map with password being list name


    }

    public void runEditClear() {

    }


}
