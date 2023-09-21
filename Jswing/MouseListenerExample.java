import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends JFrame implements MouseListener{
    JButton b;
    MouseListenerExample()
    {   
        b=new JButton("Button 1");
        // b.setBounds(0,0,100,100);
        b.setBackground(Color.red);
        setLayout(new FlowLayout());
        b.addMouseListener(this);
        // l.setOpaque(true);
        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("YOu clicked mouse");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.println("You pressed mouse");
    }
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("YOu released mouse");

    }
    public void mouseExited(MouseEvent e)
    {
        System.out.println("YOu exited mouse");

    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("YOu entered mouse");

    }
    public static void main(String[] args){
        new MouseListenerExample();
    }
}