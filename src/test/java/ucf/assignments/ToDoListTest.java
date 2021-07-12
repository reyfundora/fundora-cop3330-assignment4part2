/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Rey Fundora
 */

package ucf.assignments;

import javafx.scene.Parent;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ToDoListTest {
    @Test
    void isItemCounterVariableEqualtoNegative() {
        // given
        int expect = -1;

        // when
        int actual = Edit.itemCounter;

        // then
        assertEquals(expect, actual);
    }
}