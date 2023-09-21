import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Buttons extends JFrame implements ActionListener{
    JButton b;
    JLabel l;
    Buttons()
    {
        ImageIcon icon=new ImageIcon("page.jpg");
        l=new JLabel("Hey i am label");
        l.setBounds(100,50,100,100);
        l.setVisible(false);        
        b=new JButton();
        b.setText("Hey");
        // b.setIcon(icon);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setFont(new Font("Comic Sans",Font.BOLD,25));
        b.setFocusable(false);
        b.setForeground(Color.blue);
        // b.setBackground(Color.red) ;
        // b.setEnabled(false); //Set button disabled
        b.setBorder(BorderFactory.createEtchedBorder());
        b.setBounds(100,100,250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        add(b);
        add(l);
        b.addActionListener(this);
        // setLayout(new FlowLayout());        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
         System.out.println("I am cliked");
         l.setVisible(true);
        }
    }
    public static void main(String[] args){
        new Buttons();
    }
}