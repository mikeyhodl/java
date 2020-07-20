import java.awt.event.*;
import javax.swing.*;

public class PushMe extends JFrame implements ActionListener
{
    JLabel mylbl = new JLbl("Idol");
    public PushMe(){
    JButton myBtn = new JButton("One");
    myBtn.setActionCommand("One");
    myBtn.addActionListener(this);
    JButton btn = new JButton("2");
    btn.setActionCommand("Two");
    btn.addActionListener(this);
    
    this.getContentPane().add(myLbl);
    this.getContentPane().add(myBtn);
    this.getContentPane().add(btn);
    }
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals("One"));
        myLbl.setText("You clicked Two");
    }
    public static void main (String[]args){
         PushMe PushMe = new PushMe();
         PushMe.pack();
         PushMe.setvisible(true);
                 
        
    }
    }

