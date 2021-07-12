package ucf.assignments;

import org.junit.jupiter.api.Test;

public class File_Open_Test {
    @Test
    void is_button_that_opens_program_working() {
        // Assign a value to one of the String arrays with a list name in an external notepad
        // Open Notepad
        // Expected = What is written; Actual = What is read;
        // Compare expected vs actual
    }
    @Test
    void is_button_that_closes_program_working() {
        // Expected value is a non-error return from program close
        // Actual Value is what prints in the console after program closes
        // Compare expected vs actual
        // If error or if program still running: test fail
    }
    @Test
    void is_button_that_saves_only_one_list_working() {
        // Print third list onto notepad and assign name to a String variable
        // expected: name of third list; actual: name of list on notepad
        // If all lists are saved (or none) then the first name will not be the third list; thus, error
        // If only one list is saved, pass.
    }
    @Test
    void is_button_that_saves_All_working() {
        // Print first list onto notepad and assign name to a String variable
        // Print last list onto notepad and assign name to a string variable
        // expected: both assigned names; actual: names of first and last list on notepad
    }

}
