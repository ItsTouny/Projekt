import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuGraphics implements MouseListener, ActionListener {
    JFrame jFrame1 = new JFrame();
    JFrame jFrame2 = new JFrame();
    JPanel jPanel;
    JButton buttonEasy;
    JButton buttonMedium;
    JButton buttonHard;
    DisplayGraphics displayGraphics = new DisplayGraphics(jFrame2);


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
        buttonEasy.setBounds(900,540,150,100);
        buttonMedium.setBounds(900,650,150,100);
        buttonHard.setBounds(900,760,150,100);
        jPanel.add(jLabel);
        jPanel.add(buttonEasy);
        jPanel.add(buttonMedium);
        jPanel.add(buttonHard);
        buttonEasy.addActionListener(this);
        buttonMedium.addActionListener(this);
        buttonHard.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonEasy) {
            Sudoku sudoku = new Sudoku(1);
            sudoku.fillValues();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            buttonEasy.removeMouseListener(this);
        }else if (e.getSource()==buttonMedium){
            Sudoku sudoku = new Sudoku(32);
            sudoku.fillValues();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            buttonMedium.removeMouseListener(this);
        }else if (e.getSource()==buttonHard){
            Sudoku sudoku = new Sudoku(45);
            sudoku.fillValues();
            sudoku.printSudoku();
            displayGraphics.setCoordinates(sudoku.setCoordinates());
            displayGraphics.setValues(sudoku.setValues());
            displayGraphics.setSolvedValues(sudoku.setSolvedValues());
            buttonHard.removeMouseListener(this);
        }
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
    }
}
