import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEvent extends JFrame implements ActionListener
 {
    JButton bluebtn, greenbtn;
    ButtonEvent() {
        bluebtn = new JButton("Blue");
        greenbtn = new JButton("Green");
       setLayout(new FlowLayout());
        bluebtn.setBounds(25,50,35,20);
        greenbtn.setBounds(75,50,35,20);
        add(bluebtn);
        add(greenbtn);
        bluebtn.addActionListener(this);
        greenbtn.addActionListener(this);
        
    }
    public void actionPerformed (ActionEvent e){
    if(e.getSource()==bluebtn)
    {
    bluebtn.setBackground(Color.BLUE);
    }
    else
    {
    greenbtn.setBackground(Color.GREEN);
    }
    }
  public static void main(String[] args) {
    ButtonEvent b = new ButtonEvent();
    b.setSize(500,500);
    b.setDefaultCloseOperation(EXIT_ON_CLOSE);
    b.setTitle("Button Events");
    b.setVisible(true);
  }
}