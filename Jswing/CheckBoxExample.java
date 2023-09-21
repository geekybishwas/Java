import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxExample extends JFrame implements ActionListener{
    JCheckBox cb;
    JButton b=new JButton("Submit");
    CheckBoxExample()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new GridLayout(3,2,5,10)); 
        setVisible(true);
        cb=new JCheckBox();
        cb.setText("I'm in,and not a robot");
        // cb.setText("I'm out");
        cb.setFocusable(false);
        cb.setFont(new Font("MV Boli",Font.PLAIN,20));
        add(cb);
        b.addActionListener(this);
        b.setFocusable(false);
        add(b);        
        this.pack();

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
        System.out.println(cb.isSelected());
        }
    }
    public static void main(String[] args){
        new CheckBoxExample();
    }
}