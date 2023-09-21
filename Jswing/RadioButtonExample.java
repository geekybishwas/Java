import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonExample extends JFrame implements ActionListener{
        JRadioButton pb=new JRadioButton("Pizza");
        JRadioButton hb=new JRadioButton("Hamburger");
        JRadioButton hdb=new JRadioButton("HotDog");
        JRadioButton mb=new JRadioButton("MOMO");
        ButtonGroup group=new ButtonGroup();
        JButton b=new JButton("Submit");
    
    RadioButtonExample()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new FlowLayout());
        group.add(pb);
        group.add(hb);
        group.add(hdb);
        group.add(mb);
        add(pb);
        add(hb);
        add(hdb);
        add(mb);
        add(b);
        pb.setFocusable(false);
        hb.setFocusable(false);
        hdb.setFocusable(false);
        mb.setFocusable(false);
        pb.addActionListener(this);
        hb.addActionListener(this);
        hdb.addActionListener(this);
        mb.addActionListener(this);
        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            if(e.getSource()==pb)
            {
            System.out.println("You order pizza");
            }
            else{
            System.out.println("uuu Order something");
            }
        }

    }
    public static void main(String[] args){
        new RadioButtonExample();   
    }
}