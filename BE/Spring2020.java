
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// public class Spring2020{
//     public static void main(String[] args){
//         JFrame f=new JFrame("Box Layout");
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JPanel p=new JPanel();
//         p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));

//         JButton b1=new JButton("Button 1");
//         JButton b2=new JButton("Button 1");
//         JButton b3=new JButton("Button 1");
//         JButton b4=new JButton("Long-Named Button 4");
//         JButton b5=new JButton("5");

//         b1.setAlignmentX(Component.CENTER_ALIGNMENT);
//         b2.setAlignmentX(Component.CENTER_ALIGNMENT);
//         b3.setAlignmentX(Component.CENTER_ALIGNMENT);
//         b4.setAlignmentX(Component.CENTER_ALIGNMENT);
//         b5.setAlignmentX(Component.CENTER_ALIGNMENT);

//         p.add(b1);
//         p.add(b2);
//         p.add(b3);
//         p.add(b4);
//         p.add(b5);

//         f.add(p);
//         f.pack();
//         f.setSize(400,400);
//         f.setVisible(true);
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Spring2020{
    public Spring2020()
    {
        JFrame f=new JFrame("Box Layout");
        JPanel p=new JPanel();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("LOng-Named Button 4");
        JButton b5=new JButton("5");

        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

        f.add(p);
        f.pack();
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new Spring2020();
    }
}