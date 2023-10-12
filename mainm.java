import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class mainm {
    public static void main(String[] args) {
        new mainwindow();
    }
}

class mainwindow implements ActionListener {

    JFrame f = new JFrame("Click me!!!");
    JButton b = new JButton("Bleh!");

    mainwindow() {

        b.setBounds(150, 60, 100, 30);
        b.setFocusable(false);
        b.addActionListener(this);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setAlwaysOnTop(true);
        f.setLayout(null);
        f.setSize(400, 200);
        f.setBackground(Color.BLACK);
        f.setLocationRelativeTo(null);
        f.add(b);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            new sillycat();
        }
    }
}

class sillycat {

    sillycat() {
        JFrame f = new JFrame("Silly cat!");
        ImageIcon i = new ImageIcon("E:\\java prj\\cat window\\silycat.jpg");
        f.setLocation(setLocationw(), setLocationh());
        f.add(new JLabel(i));
        f.setSize(268, 188);
        f.setVisible(true);
    }

    int setLocationh() {
        Random x = new Random();
        return x.nextInt(0, 800);
    }

    int setLocationw() {
        Random x = new Random();
        return x.nextInt(0, 1200);
    }
}
