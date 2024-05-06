import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel{

    public DisplayGraphics(){
        setLayout(null);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        button1.addActionListener(e -> System.out.println("1"));
        button2.addActionListener(e -> System.out.println("2"));
        button3.addActionListener(e -> System.out.println("3"));
        button4.addActionListener(e -> System.out.println("4"));
        button5.addActionListener(e -> System.out.println("5"));
        button6.addActionListener(e -> System.out.println("6"));
        button7.addActionListener(e -> System.out.println("7"));
        button8.addActionListener(e -> System.out.println("8"));
        button9.addActionListener(e -> System.out.println("9"));
        button1.setBounds(1000,50,50,50);
        button2.setBounds(1055,50,50,50);
        button3.setBounds(1110,50,50,50);
        button4.setBounds(1165,50,50,50);
        button5.setBounds(1220,50,50,50);
        button6.setBounds(1275,50,50,50);
        button7.setBounds(1330,50,50,50);
        button8.setBounds(1385,50,50,50);
        button9.setBounds(1440,50,50,50);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
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
