import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        DisplayGraphics d = new DisplayGraphics();
        jFrame.add(d);
        jFrame.setSize(1920,1080);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}