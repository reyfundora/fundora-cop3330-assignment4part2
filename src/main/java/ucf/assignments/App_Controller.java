package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class App_Controller {

    public MenuItem File_Open, File_Save_Single, File_Save_All, File_Close, Edit_New_List, Edit_New_Item,
                    View_All, View_Completed, View_Incompleted, Help_Getting_Started, Help_About,
                    RC_List_Rename, RC_List_Delete, RC_Item_MComplete, RC_Item_MIncomplete, RC_Item_Rename,
                    RC_Item_Date, RC_Item_Delete;

    @FXML
    public void Open_Button_Click(ActionEvent actionEvent) {
        ucf.assignments.File_Open.run_open();
    }

    @FXML
    public void Save_Single_Button_Click(ActionEvent actionEvent) {
        File_Save.run_single_save();
    }

    @FXML
    public void Save_All_Button_Click(ActionEvent actionEvent) {
        File_Save.run_all_save();
    }

    @FXML
    public void Close_Button_Click(ActionEvent actionEvent) {
        ucf.assignments.File_Close.run_close();
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
    public void list_rename_button_click(ActionEvent actionEvent) {
        List_Right_CLick.run_rename();
    }

    @FXML
    public void list_delete_button_click(ActionEvent actionEvent) {
        List_Right_CLick.run_delete();
    }

    @FXML
    public void mark_com_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_mark_yes();
    }

    @FXML
    public void mark_incom_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_mark_no();
    }

    @FXML
    public void item_rename_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_rename();
    }

    @FXML
    public void item_redate_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_redate();
    }

    @FXML
    public void item_delete_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_delete();
    }
}
