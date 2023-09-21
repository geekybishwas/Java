import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class openWindowExample implements ActionListener{
    JFrame f;
    JButton b=new JButton("New Window");
    openWindowExample()
    {
        f=new JFrame();
        b.setFocusable(false);
        b.setBounds(100,50,100,100);
        b.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(new FlowLayout()); //hori,vertical spacing
        f.setVisible(true);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            f.dispose(); //delete the previos frame from the screen
            JFrame f1=new JFrame();
            JLabel l=new JLabel("Hello");
            f1.setSize(400,400);
            f1.setVisible(true);
            l.setBounds(0,0,200,100);
            l.setFont(new Font("Comic Sans",Font.BOLD,25));
            f1.add(l);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args){
        new openWindowExample();
    }
}