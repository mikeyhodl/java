import javax.swing.*;
public class PushMe extends JFrame{
    public PushMe(){
        JFrame myJFrame = new JFrame("My Swing Window");
        JButton button = new JButton("Push Me");
        myJFrame.getContentPane ().add(button);
        myJFrame.pack();
        myJFrame.setVisible(true);
    }
    public static void main(String[]args){
        PushMe myPushMe = new PushMe();
        
        
    }
}