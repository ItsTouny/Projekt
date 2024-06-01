import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * The MenuGraphics class represents the graphical user interface for the Sudoku game menu.
 */
public class MenuGraphics implements MouseListener, ActionListener {
    JFrame jFrame1 = new JFrame();
    JFrame jFrame2 = new JFrame();
    JFrame jFrame3 = new JFrame();
    JPanel jPanel;
    JButton buttonEasy;
    JButton buttonMedium;
    JButton buttonHard;
    JButton buttonImpossible;
    DisplayGraphics displayGraphics = new DisplayGraphics(jFrame2);
    DisplayGraphicsImpossible displayGraphicsImpossible = new DisplayGraphicsImpossible(jFrame3);

    /**
     * Constructs a MenuGraphics object and initializes the GUI components.
     */
    public MenuGraphics(){
        jPanel = new JPanel();
        jFrame1.setSize(1920,1080);
        jFrame1.setResizable(false);
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame1.setLocationRelativeTo(null);
        jPanel.setLayout(null);
        JLabel jLabel = new JLabel("SUDOKU");
        jLabel.setFont(new Font("font",Font.PLAIN,200));
        jLabel.setBounds(0,0,1000,1000);
        jLabel.setLocation(550,-300);
        buttonEasy = new JButton("Easy");
        buttonMedium = new JButton("Medium");
        buttonHard = new JButton("Hard");
        buttonImpossible = new JButton("Impossible");
        buttonEasy.setBounds(900,540,150,100);
        buttonMedium.setBounds(900,650,150,100);
        buttonHard.setBounds(900,760,150,100);
        buttonImpossible.setBounds(900,870,150,100);
        jPanel.add(jLabel);
        jPanel.add(buttonEasy);
        jPanel.add(buttonMedium);
        jPanel.add(buttonHard);
        jPanel.add(buttonImpossible);
        buttonEasy.addActionListener(this);
        buttonMedium.addActionListener(this);
        buttonHard.addActionListener(this);
        buttonImpossible.addActionListener(this);
        jFrame1.getContentPane().add(jPanel);
        jFrame1.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    /**
     * Handles action events triggered by the play button.
     *
     * @param e the ActionEvent object containing details about the event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonEasy) {
            Sudoku sudoku = new Sudoku(20);
            sudoku.fillValues();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            displayGraphics.printValues();
            jFrame1.dispose();
            jFrame2.setLayout(null);
            displayGraphics.setBounds(0,0,1920,1080);
            jFrame2.add(displayGraphics);
            jFrame2.revalidate();
            jFrame2.repaint();
            jFrame2.setSize(1920,1080);
            jFrame2.setResizable(false);
            jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame2.setLocationRelativeTo(null);
            jFrame2.setVisible(true);
            jFrame2.removeMouseListener(this);
            buttonEasy.removeMouseListener(this);
        }else if (e.getSource()==buttonMedium){
            Sudoku sudoku = new Sudoku(32);
            sudoku.fillValues();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            displayGraphics.printValues();
            jFrame1.dispose();
            jFrame2.setLayout(null);
            displayGraphics.setBounds(0,0,1920,1080);
            jFrame2.add(displayGraphics);
            jFrame2.revalidate();
            jFrame2.repaint();
            jFrame2.setSize(1920,1080);
            jFrame2.setResizable(false);
            jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame2.setLocationRelativeTo(null);
            jFrame2.setVisible(true);
            jFrame2.removeMouseListener(this);
            buttonMedium.removeMouseListener(this);
        }else if (e.getSource()==buttonHard){
            Sudoku sudoku = new Sudoku(45);
            sudoku.fillValues();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            displayGraphics.printValues();
            jFrame1.dispose();
            jFrame2.setLayout(null);
            displayGraphics.setBounds(0,0,1920,1080);
            jFrame2.add(displayGraphics);
            jFrame2.revalidate();
            jFrame2.repaint();
            jFrame2.setSize(1920,1080);
            jFrame2.setResizable(false);
            jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame2.setLocationRelativeTo(null);
            jFrame2.setVisible(true);
            jFrame2.removeMouseListener(this);
            buttonHard.removeMouseListener(this);
        }else if (e.getSource()==buttonImpossible){
            setImpossible();
            displayGraphicsImpossible.printValues();
            jFrame1.dispose();
            jFrame3.setLayout(null);
            displayGraphicsImpossible.setBounds(0,0,1920,1080);
            jFrame3.add(displayGraphicsImpossible);
            jFrame3.revalidate();
            jFrame3.repaint();
            jFrame3.setSize(1920,1080);
            jFrame3.setResizable(false);
            jFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame3.setLocationRelativeTo(null);
            jFrame3.setVisible(true);
            jFrame3.removeMouseListener(this);
            buttonImpossible.removeMouseListener(this);
        }

    }
    /**
     * Setup for impossible difficulty
     */
    public void setImpossible(){
        try {
            BufferedReader bf = new BufferedReader(new FileReader("ImpossibleSudoku"));
            char[] s =bf.readLine().toCharArray();
            ArrayList<Integer> solvedValues = new ArrayList<>();
            ArrayList<Coordinates> coordinates2 = new ArrayList<>();
            ArrayList<Integer> values = new ArrayList<>();
            for (int i = 0; i < s.length; i++) {
                solvedValues.add(Integer.valueOf(s[i]-'0'));
            }
            coordinates2.add(new Coordinates(300+35,(400-500)*-1));
            coordinates2.add(new Coordinates(700+35,(400-600)*-1));
            values.add(1);
            values.add(2);
            displayGraphicsImpossible.setSolvedValues(solvedValues);
            displayGraphicsImpossible.setCoordinates(coordinates2);
            displayGraphicsImpossible.setValues(values);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
