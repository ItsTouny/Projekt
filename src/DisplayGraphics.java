import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
       // button1.addActionListener(e -> addMouseListener(e1 -> System.out.println()));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("1");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("2");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());
                    }
                });
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("3");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("4");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50, 50, 900, 900);
                        jLabel1.setLocation((e.getX() / 100) * 100 + 35, ((400 - (e.getY() / 100) * 100)) * -1);
                        jLabel1.setFont(new Font("font", Font.PLAIN, 50));
                        jLabel1.setText("5");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX() + " " + e.getY());

                    }
                });
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("6");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("7");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("8");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());

                    }
                });
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mouseClicked(e);
                        JLabel jLabel1 = new JLabel();
                        jLabel1.setBounds(50,50,900,900);
                        jLabel1.setLocation((e.getX()/100)*100+35,((400-(e.getY()/100)*100))*-1);
                        jLabel1.setFont(new Font("font",Font.PLAIN,50));
                        jLabel1.setText("9");
                        add(jLabel1);
                        jLabel1.repaint();
                        System.out.println(e.getX()+" "+e.getY());
                    }
                });
            }
        });
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
        g.drawLine(100,200,1000,200);
        g.drawLine(100,300,1000,300);
        g.drawLine(100,500,1000,500);
        g.drawLine(100,600,1000,600);
        g.drawLine(100,800,1000,800);
        g.drawLine(100,900,1000,900);
        g.drawLine(200,100,200,1000);
        g.drawLine(300,100,300,1000);
        g.drawLine(500,100,500,1000);
        g.drawLine(600,100,600,1000);
        g.drawLine(800,100,800,1000);
        g.drawLine(900,100,900,1000);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(100,100,900,900);
        g.drawLine(100,400,1000,400);
        g.drawLine(100,700,1000,700);
        g.drawLine(400,100,400,1000);
        g.drawLine(700,100,700,1000);
    }
}