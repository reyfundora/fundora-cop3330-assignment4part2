package ucf.assignments;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static ucf.assignments.Edit.*;

import java.net.URL;
import java.util.ResourceBundle;

public class appController implements Initializable {

    // Menu > File
    public void FileOpenClicked() {
    }

    public void FileSaveClicked() {
    }

    public void FileCloseClicked() {
    }

    // Menu > Edit
    public void EditNewClicked() {
        new Edit().runEditNew();
    }

    public void EditDeleteClicked() {
        new Edit().runEditDelete();
    }

    public void EditClearAllClicked() {
        new Edit().runEditClear();
    }

    // Menu > View
    public void ViewAllClicked() {
    }

    public void ViewCompleteClicked() {
    }

    public void ViewIncompleteClicked() {
    }

    // Menu > Help
    public void GettingStartedClicked() {
        new Help().runGettingStarted();
    }

    public void AboutClicked() {
        new Help().runAbout();
    }

    // Right Click Related
    public void RCMarkIncompleteClicked() {
    }

    public void RCMarkCompleteClicked() {
    }

    public void RCRenameClicked() {
    }

    public void RCRedateClicked() {
    }

    public void RCDeleteClicked() {
    }

    // Table Controller
    @FXML private ListView<String> listView;

    public void refresh() { listView.refresh(); }

    public void initialize(URL url, ResourceBundle rb) {
        try {
        listView.getItems().addAll(items[0]);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        }
       catch (NullPointerException e) { System.out.print("null"); }
    }
}
