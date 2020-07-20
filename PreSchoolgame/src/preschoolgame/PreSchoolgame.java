import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class PreSchoolgame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu	menu;
	JMenuItem menuItem;
    JLabel text;
	
public PreSchoolgame() {
	menuBar= new JMenuBar();
	setJMenuBar(menuBar);

	menu= new JMenu("Colors");
	menuBar.add(menu);

   

    menuItem = new JMenuItem("Green");
	menuItem.setActionCommand("green");
	menuItem.addActionListener(this);
	menu.add(menuItem);
        
    menuItem = new JMenuItem("Yellow");
	menuItem.setActionCommand("yellow");
	menuItem.addActionListener(this);
	menu.add(menuItem);


    menuItem = new JMenuItem("Blue");
	menuItem.setActionCommand("blue");
	menuItem.addActionListener(this);
	menu.add(menuItem);
         menuItem = new JMenuItem("Red");
	menuItem.setActionCommand("red");
	menuItem.addActionListener(this);
	menu.add(menuItem);

    menuItem = new JMenuItem("Orange");
	menuItem.setActionCommand("orange");
	menuItem.addActionListener(this);
	menu.add(menuItem);

    
    	//JTextField text;
        //text = new JTextField();
        text=new JLabel("ENJOYING THE GAME");
        text.setSize(new java.awt.Dimension(500,500));
	getContentPane().add(text);

	setLocation(new java.awt.Point(0, 30));
	setSize(new java.awt.Dimension(400, 400));
	setTitle("PreSchoolgame");
	setVisible(true);
}
 public void actionPerformed(ActionEvent e) {
  
         if(e.getActionCommand().equals("green")) {
        text.setForeground(Color.green);
    } 
          if(e.getActionCommand().equals("yellow")) {
        text.setForeground(Color.yellow);
    }   
     if(e.getActionCommand().equals("blue")) {
        text.setForeground(Color.blue);
    } 
        if(e.getActionCommand().equals("red")) {
        text.setForeground(Color.red);
        
    }  
     if(e.getActionCommand().equals("orange")) {
        text.setForeground(Color.orange);
    }  
   
 }
 public static void main(String[] args) {
       PreSchoolgame game=new PreSchoolgame();
    }
}
