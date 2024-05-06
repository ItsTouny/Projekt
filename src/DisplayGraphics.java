import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(100,100,800,800);
    }
}
