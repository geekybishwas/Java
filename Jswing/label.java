import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class label{
    public static void main(String[] args){
        JFrame f=new JFrame();
        JLabel l=new JLabel("Hey i am where in x and y position");
        f.setTitle("Label Demo");
        f.setSize(400,400);
        f.setVisible(true);
        l.setHorizontalTextPosition(JLabel.RIGHT);
        l.setVerticalTextPosition(JLabel.TOP);
        l.setFont(new Font("MV Boli",Font.PLAIN,20));
        f.add(l);
        f.getContentPane();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
