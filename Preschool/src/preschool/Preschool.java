import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Preschool {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Enjoying the Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton butt1 = new JButton("BLACK");
        butt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLACK);
            }
        });
        JButton butt2 = new JButton("BLUE");
        butt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
                  }
        });
         JButton butt3 = new JButton("GREEN");
        butt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });
         JButton butt4 = new JButton("YELLOW");
        butt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.YELLOW);
            }
        });
         JButton butt5 = new JButton("PINK");
        butt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.PINK);
            }
        });


        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(butt1);
        frame.getContentPane().add(butt2);
        frame.getContentPane().add(butt3);
        frame.getContentPane().add(butt4);
        frame.getContentPane().add(butt5);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}