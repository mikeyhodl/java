import java.awt.GraphicsConfiguration;
import java.awt.PopupMenu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameExample {
        static GraphicsConfiguration gc;
    public static void main(String[] args){
        JFrame frame= new JFrame(gc);   
               JPanel main = new JPanel();
               JLabel myLabel = new JLabel();
               myLabel.setText("Java in the Future ");
            PopupMenu notifyline1 = null;
               main.add(myLabel);
               frame.add(main);
        frame.setTitle("Basic Demo");
        frame.setSize(600, 400);
        frame.setLocation(200, 200);
        frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}