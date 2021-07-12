package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.skin.SliderSkin;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.control.*;

import java.io.*;
import java.util.*;

public class Edit {
    @FXML
    public DatePicker AddDate;
    @FXML
    public TextArea AddDescription;
    @FXML
    public Button AddButton;
    @FXML
    public Button DeleteButton;
    @FXML
    public TextField deleteNum;

    public appController appController;

    static ArrayList<String> items = new ArrayList<>();
    static int itemCounter = -1, itemCounterTwo = 0;


    // After clicking 'add' in runEditNew popup window
    public void AddButtonClicked() throws IOException {
        FileWriter output = new FileWriter("itemAdd.txt");
        output.write(AddDescription.getText() + "\n");
        output.write(AddDate.getValue() + "\n");
        output.close();

        FileReader input = new FileReader("itemAdd.txt");
        Scanner read = new Scanner(input);

        itemCounter++;
        items.add(read.nextLine());
        itemCounter++;
        items.add(read.nextLine());
        itemCounterTwo++;

        System.out.print(items.get(0) + items.get(1));

        Stage stage = (Stage) AddButton.getScene().getWindow();
        stage.close();

        appController.addTodoItem(itemCounterTwo + ".    " + items.get(itemCounter) + "        " + items.get(itemCounter - 1));
    }

    public void DeleteButtonClicked(ActionEvent actionEvent) {
    }
}
