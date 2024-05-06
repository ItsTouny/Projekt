import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayGraphics extends JPanel{

    public DisplayGraphics(){
        setLayout(null);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("3");
            }
        });
        button1.setBounds(1000,50,50,50);
        button2.setBounds(1055,50,50,50);
        button3.setBounds(1110,50,50,50);
        add(button1);
        add(button2);
        add(button3);
    }
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
