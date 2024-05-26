import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuGraphics extends JPanel implements MouseListener, ActionListener {
    JFrame jFrame;
    JPanel jPanel;
    JButton buttonEasy;

    public MenuGraphics(){
        jFrame = new JFrame();
        jPanel = new JPanel();
        jFrame.setSize(1920,1080);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jPanel.setLayout(null);
        buttonEasy = new JButton("Easy");
        buttonEasy.setBounds(1050,200,100,50);
        jPanel.add(buttonEasy);
        buttonEasy.addActionListener(this);
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
        if (e.getSource()==buttonEasy){
            jFrame.dispose();
            System.out.println("hello");
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
