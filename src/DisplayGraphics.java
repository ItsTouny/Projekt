import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(50,150,950,150);
        g.drawLine(50,250,950,250);
        g.drawLine(50,450,950,450);
        g.drawLine(50,550,950,550);
        g.drawLine(50,750,950,750);
        g.drawLine(50,850,950,850);
        g.drawLine(150,50,150,950);
        g.drawLine(250,50,250,950);
        g.drawLine(450,50,450,950);
        g.drawLine(550,50,550,950);
        g.drawLine(750,50,750,950);
        g.drawLine(850,50,850,950);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(50,50,900,900);
        g.drawLine(50,350,950,350);
        g.drawLine(50,650,950,650);
        g.drawLine(350,50,350,950);
        g.drawLine(650,50,650,950);
    }
}
