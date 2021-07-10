package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;

public class AppController {
    public MenuItem RCRename, FileSave, FileOpen, FileClose, EditNew, EditDelete, EditClearAll, ViewAll,
                    ViewComplete, ViewIncomplete, GettingStarted, About, RCMarkComplete, RCMarkIncomplete,
                    RCRedate, RCDelete;

    // Menu > File
    public void FileOpenClicked(ActionEvent actionEvent) {
    }

    public void FileSaveClicked(ActionEvent actionEvent) {
    }

    public void FileCloseClicked(ActionEvent actionEvent) {
    }

    // Menu > Edit
    public void EditNewClicked(ActionEvent actionEvent) {
    }

    public void EditDeleteClicked(ActionEvent actionEvent) {
    }

    public void EditClearAllClicked(ActionEvent actionEvent) {
    }

    // Menu > View
    public void ViewAllClicked(ActionEvent actionEvent) {
    }

    public void ViewCompleteClicked(ActionEvent actionEvent) {
    }

    public void ViewIncompleteClicked(ActionEvent actionEvent) {
    }

    // Menu > Help
    public void GettingStartedClicked(ActionEvent actionEvent) {
        new Help().RunGettingStarted();
    }

    public void AboutClicked(ActionEvent actionEvent) {
        new Help().RunAbout();
    }

    // Right Click Related
    public void RCMarkIncompleteClicked(ActionEvent actionEvent) {
    }

    public void RCMarkCompleteClicked(ActionEvent actionEvent) {
    }

    public void RCRenameClicked(ActionEvent actionEvent) {
    }

    public void RCRedateClicked(ActionEvent actionEvent) {
    }

    public void RCDeleteClicked(ActionEvent actionEvent) {
    }

}
