import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuGraphics extends JPanel implements MouseListener, ActionListener {
    JFrame jFrame;
    JPanel jPanel;
    JButton buttonEasy;
    JButton buttonMedium;
    JButton buttonHard;

    public MenuGraphics(){
        jFrame = new JFrame();
        jPanel = new JPanel();
        jFrame.setSize(1920,1080);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jPanel.setLayout(null);
        JLabel jLabel = new JLabel("SUDOKU");
        jLabel.setFont(new Font("font",Font.PLAIN,200));
        jLabel.setBounds(0,0,1000,1000);
        jLabel.setLocation(500,-300);
        buttonEasy = new JButton("Easy");
        buttonMedium = new JButton("Medium");
        buttonHard = new JButton("Hard");
        buttonEasy.setBounds(850,540,150,100);
        buttonMedium.setBounds(850,650,150,100);
        buttonHard.setBounds(850,760,150,100);
        jPanel.add(jLabel);
        jPanel.add(buttonEasy);
        jPanel.add(buttonMedium);
        jPanel.add(buttonHard);
        buttonEasy.addActionListener(this);
        buttonMedium.addActionListener(this);
        buttonHard.addActionListener(this);
        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
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
            jFrame.dispose();
            System.out.println("1");
            JFrame jFrame = new JFrame();
            jFrame.add(new DisplayGraphics());
            jFrame.setSize(1920, 1080);
            jFrame.setResizable(false);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            removeMouseListener(this);
        }else if (e.getSource()==buttonMedium){
            jFrame.dispose();
            System.out.println("2");
            JFrame jFrame = new JFrame();
            jFrame.add(new DisplayGraphics());
            jFrame.setSize(1920,1080);
            jFrame.setResizable(false);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            removeMouseListener(this);
        }else if (e.getSource()==buttonHard){
            jFrame.dispose();
            System.out.println("3");
            JFrame jFrame = new JFrame();
            jFrame.add(new DisplayGraphics());
            jFrame.setSize(1920,1080);
            jFrame.setResizable(false);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            removeMouseListener(this);
        }
    }
}
