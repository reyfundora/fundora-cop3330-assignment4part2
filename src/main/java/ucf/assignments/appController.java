package ucf.assignments;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import static ucf.assignments.Edit.*;

import java.net.URL;
import java.util.ResourceBundle;

public class appController implements Initializable {

    public MenuItem FileClose;

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

    // Menu > Edit
    @FXML
    public void EditNewClicked() {
        new Edit().runEditNew();
    }
    @FXML
    public void EditDeleteClicked() {
        new Edit().runEditDelete();
    }
    @FXML
    public void EditClearAllClicked() {
        new Edit().runEditClear();
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

    // Menu > Help
    @FXML
    public void GettingStartedClicked() {
        new Help().runGettingStarted();
    }

    @FXML
    public void AboutClicked() {
        new Help().runAbout();
    }

    // Right Click Related
    @FXML
    public void RCMarkIncompleteClicked() {
    }

    @FXML
    public void RCMarkCompleteClicked() {
    }

    @FXML
    public void RCRenameClicked() {
    }

    @FXML
    public void RCRedateClicked() {
    }

    @FXML
    public void RCDeleteClicked() {
    }

    // Table Controller
    @FXML private ListView<String> listView;
    ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    public void refresh() { listView.refresh(); }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        try {
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            listView.getItems().addAll("2021-07-01      Eat Pizza", "2021-09-23      Go for a walk!",
                    "2021-09-29      Study for big test.", "2021-10-01      Read a book!",
                    "2023-05-25      Graduate from school!");
        }
        catch (NullPointerException e) { System.out.print(""); }
    }
}