package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

public class tableSetGet {
    private  SimpleStringProperty date;
    private  SimpleStringProperty description;

    public tableSetGet(String date, String description) {
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description = new SimpleStringProperty(description);
    }

    public String getDate() {
        return date.get();
    }

    public void setDate(String date) {
        this.date = new SimpleStringProperty(date);
    }
}