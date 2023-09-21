import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardLayoutEx extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    CardLayout card;
    Container c;
    CardLayoutEx()
    {   
        c=getContentPane();
        card=new CardLayout(40,30);
        c.setLayout(card);
        b1=new JButton("Ace");
        b2=new JButton("King");
        b3=new JButton("Queen");
        b4=new JButton("Jocker");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        add(c);
    }
    public void actionPerformed(ActionEvent e)
    {
        card.next(c);
    }
    public static void main(String[] args){
        CardLayoutEx cl=new CardLayoutEx();
        cl.setSize(400,400);
        cl.setVisible(true);
        
    }
}