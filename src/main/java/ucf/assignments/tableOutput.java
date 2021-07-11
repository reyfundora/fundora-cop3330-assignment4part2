package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class tableOutput {
    public void table() {
        appController test = new appController();
        TableColumn date = test.DueDateTable;
        TableColumn description = test.DescriptionTable;


    }
}
