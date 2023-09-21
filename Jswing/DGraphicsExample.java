import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DGraphicsExample extends JFrame{
    
    DGraphicsExample()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {   
        Graphics2D g2D=(Graphics2D) g;
        g2D.setPaint(Color.blue);
        g2D.drawLine(0,0,400,400);
        g2D.drawRect(0,0,100,200);

        g2D.drawArc(10,10,100,100,180,180);
    }
    public static void main(String[] args){
         new DGraphicsExample();
    }
}