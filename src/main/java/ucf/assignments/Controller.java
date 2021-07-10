package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {

    public MenuItem File_Open, File_Save_Single, File_Save_All, File_Close, Edit_New_List, Edit_New_Item,
                    View_All, View_Completed, View_Incompleted, Help_Getting_Started, Help_About,
                    RC_List_Rename, RC_List_Delete, RC_Item_MComplete, RC_Item_MIncomplete, RC_Item_Rename,
                    RC_Item_Date, RC_Item_Delete;


    @FXML
    public void Close_Button_Click(ActionEvent actionEvent) {
        File.run_close();
    }

    @FXML
    public void New_List_Button_Click(ActionEvent actionEvent) {
    }

    @FXML
    public void New_Item_Button_Click(ActionEvent actionEvent) {
        Edit.run_new_item();
    }

    @FXML
    public void All_Button_Click(ActionEvent actionEvent) {
        View.run_view_all();
    }

    @FXML
    public void Completed_Button_Click(ActionEvent actionEvent) {
        View.run_view_yes();
    }

    @FXML
    public void Incompleted_Button_Click(ActionEvent actionEvent) {
        View.run_view_no();
    }

    @FXML
    public void Started_Button_Click(ActionEvent actionEvent) {
        Help.run_tutorial();
    }

    @FXML
    public void About_Button_Click(ActionEvent actionEvent) {
        Help.run_about();
    }

    @FXML
    public void mark_com_button_click(ActionEvent actionEvent) {
        RightClickView.run_mark_yes();
    }

    @FXML
    public void mark_incom_button_click(ActionEvent actionEvent) {
        RightClickView.run_mark_no();
    }

    @FXML
    public void item_rename_button_click(ActionEvent actionEvent) {
        RightClickView.run_rename();
    }

    @FXML
    public void item_redate_button_click(ActionEvent actionEvent) {
        RightClickView.run_redate();
    }

    @FXML
    public void item_delete_button_click(ActionEvent actionEvent) {
        RightClickView.run_delete();
    }
}
