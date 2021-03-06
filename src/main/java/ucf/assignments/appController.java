/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Rey Fundora
 */

package ucf.assignments;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.stage.Stage;

import static ucf.assignments.Edit.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class appController implements Initializable {

    public MenuItem FileClose;
    public TextField deleteNum;

    @FXML
    public void FileCloseClicked() {
        Platform.exit();
    }

    // Menu > File
    @FXML
    public void FileOpenClicked() {
        new File().runOpen();
    }
    @FXML
    public void FileSaveClicked() {
        new File().runSave();
    }

    // Menu > View
    @FXML
    public void ViewAllClicked() {
    }

    @FXML
    public void ViewCompleteClicked() {
    }

    @FXML
    public void ViewIncompleteClicked() {
    }

    @FXML
    public void RCMarkIncompleteClicked() {
    }

    @FXML
    public void RCMarkCompleteClicked() {
    }

    // Menu > Help
    @FXML
    public void GettingStartedClicked() {
        new Help().runGettingStarted();
    }

    @FXML
    public void AboutClicked() {
        new Help().runAbout();
    }

    // Menu > Edit
    @FXML
    public void EditNewClicked() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("promptNewItem.fxml"));
            Scene scene = new Scene(loader.load());

            Edit controller = loader.getController();
            controller.appController = this;

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

    @FXML
    public void EditDeleteClicked() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("promptDelete.fxml"));
            Scene scene = new Scene(root);

            Stage popStage = new Stage();
            popStage.setScene(scene);
            popStage.setTitle("Delete Item!");
            popStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    // Table Controller
    @FXML private ListView<String> listView;
    ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        try {
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            listView.setCellFactory(TextFieldListCell.forListView());
        }
        catch (NullPointerException e) { System.out.print(""); }
    }

    public void addTodoItem(String item) {
        listView.getItems().add(item);
    }

    public void EditClearAllClicked() {
        listView.getItems().clear();
    }

    public void deleteRCClicked(ActionEvent actionEvent) {
        try {
            int index = listView.getSelectionModel().getSelectedIndex();

            if (index >= 0)
                listView.getItems().remove(index);
        }
        catch (NullPointerException e) { System.out.print("null"); }
    }
}