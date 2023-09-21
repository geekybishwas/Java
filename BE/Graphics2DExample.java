import java.awt.*;
import java.awt.event.*;
public class Graphics2DExample extends Frame{ 
    Graphics2DExample()
    {
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {   
        // super.paint(g);
        Graphics2D g2D=(Graphics2D) g;
        g2D.drawLine(0,0,400,400);
        g2D.drawRect(0,0,100,200);
    }
    public static void main(String[] args){
        new Graphics2DExample();
    }
}