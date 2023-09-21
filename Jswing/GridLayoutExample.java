import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GridLayoutExample{
    public static void main(String[] args){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(new GridLayout(3,2,5,10)); 
        f.setVisible(true);
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
    }
}