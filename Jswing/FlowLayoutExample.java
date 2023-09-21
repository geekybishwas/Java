import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FlowLayoutExample{
    public static void main(String[] args){
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        p.setPreferredSize(new Dimension(250,250));
        p.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,2,0)); //hori,vertical spacing
        f.setVisible(true);
        JButton b1=new JButton("Button 1");
        b1.setFocusable(false);
        p.add(b1);
        p.setLayout(new FlowLayout());
        p.add(new JButton("Button 2"));
        p.add(new JButton("Button 3"));
        p.add(new JButton("Button 4"));
        p.add(new JButton("Button 5"));
        p.add(new JButton("Button 6"));
        p.add(new JButton("Button 7"));
        p.add(new JButton("Button 8"));
        p.add(new JButton("Button 9"));
        f.add(p);
    }
}