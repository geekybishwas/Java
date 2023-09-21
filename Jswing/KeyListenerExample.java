import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerExample extends JFrame implements KeyListener{
    JLabel l;
    KeyListenerExample()
    {
        l=new JLabel();
        l.setBackground(Color.red);
        l.setOpaque(true);
        add(l);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        this.addKeyListener(this);
    }
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void keyPressed(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {
        System.out.println("You released key Character " + e.getKeyChar());
        System.out.println("You released key Character " + e.getKeyCode());
    }
    public static void main(String[] args){
        new KeyListenerExample();
    }
}