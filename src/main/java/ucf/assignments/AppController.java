package ucf.assignments;

import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class AppController {
    public MenuItem RCRename, FileSave, FileOpen, FileClose, EditNew, EditDelete, EditClearAll, ViewAll,
                    ViewComplete, ViewIncomplete, GettingStarted, About, RCMarkComplete, RCMarkIncomplete,
                    RCRedate, RCDelete;

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

}
