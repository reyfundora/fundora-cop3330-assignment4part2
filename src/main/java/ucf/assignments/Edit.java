package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;

import java.io.*;
import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;

public class Edit {
    @FXML
    public DatePicker AddDate;
    @FXML
    public TextArea AddDescription;
    @FXML
    public Button AddButton;

    static String[] items = new String[200];
    static int itemCounter = -1;

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
        public void AddButtonClicked() throws IOException {
            FileWriter output = new FileWriter("itemAdd.txt");
            output.write(AddDescription.getText() + "\n");
            output.write(AddDate.getValue() + "\n");
            output.close();

            FileReader input = new FileReader("itemAdd.txt");
            Scanner read = new Scanner(input);

            itemCounter++;
            items[0] = read.nextLine();
            itemCounter++;
            items[1] = read.nextLine();

            Stage stage = (Stage) AddButton.getScene().getWindow();
            stage.close();
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
