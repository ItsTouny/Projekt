import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DisplayGraphics extends JPanel implements MouseListener {
    private String number;
    private ArrayList<Coordinates> coordinates = new ArrayList<>();
    private ArrayList<Integer> values = new ArrayList<>();
    private ArrayList<Integer> solvedValues = new ArrayList<>();
    private JLabel heart1;
    private JLabel heart2;
    private JLabel heart3;
    private int life=3;


    public ArrayList<Integer> getSolvedValues() {
        return solvedValues;
    }

    public void setSolvedValues(ArrayList<Integer> solvedValues) {
        this.solvedValues = solvedValues;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }

    public ArrayList<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }
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
        heart1 = new JLabel();
        ImageIcon icon1 = new ImageIcon("heart3.png");
        heart1.setIcon(icon1);
        heart1.setBounds(0, 0, 225, 225);
        heart1.setLocation(1150,800);
        add(heart1);
        heart2 = new JLabel();
        heart2.setIcon(icon1);
        heart2.setBounds(0, 0, 225, 225);
        heart2.setLocation(1315,800);
        add(heart2);
        heart3 = new JLabel();
        heart3.setIcon(icon1);
        heart3.setBounds(0, 0, 225, 225);
        heart3.setLocation(1485,800);
        add(heart3);
        button1.addActionListener(e -> {
            number="1";
            addMouseListener(this);
        });
        button2.addActionListener(e -> {
            number="2";
            addMouseListener(this);
        });
        button3.addActionListener(e -> {
            number="3";
            addMouseListener(this);
        });button4.addActionListener(e -> {
            number="4";
            addMouseListener(this);
        });button5.addActionListener(e -> {
            number="5";
            addMouseListener(this);
        });button6.addActionListener(e -> {
            number="6";
            addMouseListener(this);
        });button7.addActionListener(e -> {
            number="7";
            addMouseListener(this);
        });button8.addActionListener(e -> {
            number="8";
            addMouseListener(this);
        });button9.addActionListener(e -> {
            number="9";
            addMouseListener(this);
        });
        button1.setBounds(1050,100,50,50);
        button2.setBounds(1105,100,50,50);
        button3.setBounds(1160,100,50,50);
        button4.setBounds(1215,100,50,50);
        button5.setBounds(1270,100,50,50);
        button6.setBounds(1325,100,50,50);
        button7.setBounds(1380,100,50,50);
        button8.setBounds(1435,100,50,50);
        button9.setBounds(1490,100,50,50);
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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (int i = 0; i < coordinates.size();i++) {
                if (((e.getX() / 100) * 100 + 35) == coordinates.get(i).getX() && ((400 - (e.getY() / 100) * 100)) * -1 == coordinates.get(i).getY()) {
                    return;
                }
        }
        if ((e.getX()<1000&&e.getX()>100)&&(e.getY()<1000&&e.getY()>100)){
            if (Integer.valueOf(number)==solvedValues.get(e.getY()/100*9-(10-e.getX()/100))){
                JLabel jLabel1 = new JLabel();
                jLabel1.setBounds(50, 50, 900, 900);
                jLabel1.setLocation((e.getX() / 100) * 100 + 35, ((400 - (e.getY() / 100) * 100)) * -1);
                jLabel1.setFont(new Font("font", Font.PLAIN, 50));
                jLabel1.setText(number);
                add(jLabel1);
                jLabel1.repaint();
                coordinates.add(new Coordinates((e.getX() / 100) * 100 + 35, ((400 - (e.getY() / 100) * 100)) * -1));
                checkWin();
            } else if (Integer.valueOf(number)!=solvedValues.get(e.getY()/100*9-(10-e.getX()/100))) {
                switch (life){
                    case 1:
                        heart1.setVisible(false);
                        removeMouseListener(this);
                        checkLose();
                        break;
                    case 2:
                        heart2.setVisible(false);
                        life--;
                        removeMouseListener(this);
                        break;
                    case 3:
                        heart3.setVisible(false);
                        life--;
                        removeMouseListener(this);
                        break;
                }
            }
        }
        removeMouseListener(this);
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
    public void printValues(){
        for (int i = 0; i < values.size(); i++) {
            JLabel jLabel1 = new JLabel();
            jLabel1.setBounds(50, 50, 900, 900);
            jLabel1.setLocation(new Point(coordinates.get(i).getX(),coordinates.get(i).getY()));
            jLabel1.setFont(new Font("font", Font.PLAIN, 50));
            jLabel1.setText(String.valueOf(values.get(i)));
            add(jLabel1);
            jLabel1.repaint();
        }
    }
    public void checkWin() {
        if (coordinates.size()==81){
            repaint();
            JLabel jLabel = new JLabel("<html>You solved<br/> this sudoku</html>",SwingConstants.CENTER);
            jLabel.setFont(new Font("font",Font.PLAIN,150));
            jLabel.setBounds(0,0,1920,1000);
            jLabel.setLocation(500,100);
            add(jLabel);
        }
    }
    public void checkLose(){
        repaint();
        JLabel jLabel = new JLabel("<html>You failed<br/> this sudoku</html>",SwingConstants.CENTER);
        jLabel.setFont(new Font("font",Font.PLAIN,150));
        jLabel.setBounds(0,0,1920,1000);
        jLabel.setLocation(500,100);
        add(jLabel);
    }
}