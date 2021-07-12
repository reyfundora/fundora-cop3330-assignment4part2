/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Rey Fundora
 */

package ucf.assignments;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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

    public appController appController;
    public appController listView;

    static ArrayList<String> items = new ArrayList<>();
    static int itemCounter = -1, itemCounterTwo = 0;
    public Button OkButton;


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

        System.out.print(items.get(0) + items.get(1));

        Stage stage = (Stage) AddButton.getScene().getWindow();
        stage.close();

        appController.addTodoItem("     " + items.get(itemCounter) + "        " + items.get(itemCounter - 1));
    }

    // After clicking 'Delete' in popup window
    public void DeleteOkClicked() {
        Stage stage = (Stage) OkButton.getScene().getWindow();
        stage.close();
    }
}
