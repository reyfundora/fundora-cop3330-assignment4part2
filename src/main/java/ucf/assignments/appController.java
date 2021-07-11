package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static ucf.assignments.Edit.*;

import java.lang.reflect.InvocationTargetException;
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
    @FXML private TableView<tableSetGet> tableView;
    @FXML private TableColumn<tableSetGet, String> dateColumn;
    @FXML private TableColumn<tableSetGet, String> descriptionColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (this.dateColumn == null) { System.out.print(""); }

        dateColumn.setCellValueFactory(new PropertyValueFactory("date"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory("description"));

        tableView.setItems(getTable());
    }


    public ObservableList<tableSetGet> getTable() {
        ObservableList<tableSetGet> test = FXCollections.observableArrayList();

        test.add(new tableSetGet("0", "1"));

        return test;
    }
}