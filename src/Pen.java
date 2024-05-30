import javax.swing.*;
import java.awt.event.ActionListener;

public class Pen extends JPanel {

    public static void pen(JFrame frame) {
        JButton button = new JButton("pen");
        button.setBounds(1150,200,50,50);
        frame.add(button);
        frame.revalidate();
        frame.repaint();
    }
}
