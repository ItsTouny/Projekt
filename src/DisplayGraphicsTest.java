import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DisplayGraphicsTest {
    private DisplayGraphics displayGraphics;

    @BeforeEach
    public void setUp() {
        JFrame frame = new JFrame();
        displayGraphics = new DisplayGraphics(frame);
    }

    @Test
    public void testSetAndGetSolvedValues() {
        ArrayList<Integer> solvedValues = new ArrayList<>();
        solvedValues.add(1);
        solvedValues.add(2);
        displayGraphics.setSolvedValues(solvedValues);
        assertEquals(solvedValues, displayGraphics.getSolvedValues());
    }

    @Test
    public void testSetAndGetValues() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(4);
        displayGraphics.setValues(values);
        assertEquals(values, displayGraphics.getValues());
    }

    @Test
    public void testSetAndGetCoordinates() {
        ArrayList<Coordinates> coordinates = new ArrayList<>();
        coordinates.add(new Coordinates(0, 0));
        coordinates.add(new Coordinates(1, 1));
        displayGraphics.setCoordinates(coordinates);
        assertEquals(coordinates, displayGraphics.getCoordinates());
    }

    @Test
    public void testCheckWin() {
        ArrayList<Coordinates> coordinates = new ArrayList<>();
        for (int i = 0; i < 81; i++) {
            coordinates.add(new Coordinates(i, i));
        }
        displayGraphics.setCoordinates(coordinates);
        displayGraphics.checkWin();
        assertTrue(displayGraphics.isWin());
    }

    @Test
    public void testCheckLose() {
        displayGraphics.checkLose();
        JLabel loseLabel = displayGraphics.getLoseLabel();
        assertEquals("<html>You failed<br/> this sudoku</html>", loseLabel.getText());
    }
}
