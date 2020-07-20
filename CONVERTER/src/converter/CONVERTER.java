package converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class converter extends JFrame implements ActionListener {

    JPanel panel;
    JLabel label;
    JTextField amntin = new JTextField(10);
    JTextField amntout = new JTextField(10);
    JButton go, exit;
    JRadioButton km, ltr, kg;

    public converter() {

        JPanel panel2;

        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setMaximumSize(new Dimension(200, 30));

        label = new JLabel("Amount in");
        panel.add(label);

        panel.add(amntin);
        panel.setAlignmentY(Component.RIGHT_ALIGNMENT);

        panel2.add(panel);

        // Amount to panel
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setMaximumSize(new Dimension(200, 30));

        label = new JLabel("Amount out");

        panel.add(label);

        panel.add(amntout);
        panel.setAlignmentY(Component.RIGHT_ALIGNMENT);

        panel2.add(panel);

        getContentPane().add(panel2);

        //conversion choice panel
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        ButtonGroup buttons = new ButtonGroup();

        km = new JRadioButton("Miles to km");
        km.setActionCommand("tokm");
        km.addActionListener(this);
        buttons.add(km);
        panel.add(km);

        ltr = new JRadioButton("Pints to litres");
        buttons.add(ltr);
        panel.add(ltr);

        kg = new JRadioButton("lbs to kg");
        buttons.add(kg);
        panel.add(kg);

        getContentPane().add("East", panel);

        //buttons panel
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        go = new JButton("Go");
        go.setActionCommand("go");
        go.addActionListener(this);
        panel.add(go);

        exit = new JButton("Exit");
        exit.setActionCommand("exit");
        exit.addActionListener(this);
        panel.add(exit);

        getContentPane().add("South", panel);

        setLocation(new java.awt.Point(0, 30));
        setSize(new java.awt.Dimension(400, 160));
        setTitle("Converter");
        setVisible(true);

    }//end of constructor

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("go")) {
            double from;
            double to;
            double tokm = 1.609;
            double tolt=2.113;
            double tomtr=0.454;
            if (km.isSelected()) {
                //JOptionPane.showMessageDialog(this, "you clicked km");
                from = Double.parseDouble(amntin.getText());
                to = tokm * from;
                amntout.setText(String.valueOf(to));
            }
            if (ltr.isSelected()) {
                //JOptionPane.showMessageDialog(this, "you clicked km");
                from = Double.parseDouble(amntin.getText());
                to = tolt* from;
                amntout.setText(String.valueOf(to));
            }
            if (kg.isSelected()) {
                //JOptionPane.showMessageDialog(this, "you clicked km");
                from = Double.parseDouble(amntin.getText());
                to = tomtr* from;
                amntout.setText(String.valueOf(to));
            }

        }
        if(e.getActionCommand().equals("exit")){
            amntout.setText("");
        }

    }

    public static void main(String[] args) {
        converter Converter = new converter();
    }
; // end of main

}//end class

