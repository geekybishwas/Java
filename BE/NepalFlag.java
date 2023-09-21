import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NepalFlag extends JFrame{
    JLabel l1,l2;
    NepalFlag()
    {
        super("Nepal Flag");
        // setTitle("Nepal Flag");
        l1=new JLabel("Nepal Flag");
        l2=new JLabel();
        l1.setBounds(10,180,100,30);
        l2.setBounds(10,190,100,30);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Sans Serif",Font.ITALIC,20));
        add(l1);
        add(l2);
        setVisible(true);
        setSize(400,400);
        // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    int x[]={10,80,30,80,10};
    int y[]={40,90,90,150,150};
    public void paint(Graphics g)
    {
        super.paint(g);

        //Draw body with red
        g.setColor(Color.red);
        g.fillPolygon(x,y,5);

        //Draw border
        g.setColor(Color.blue);
        g.drawPolygon(x,y,5);
        g.setColor(Color.white);
        
        //Draw sun
        g.fillOval(20,115,20,20);
        
        //Draw moon
        g.drawArc(20,60,20,20,0,-180);
        
        //Draw pool
        g.setColor(Color.green);
        g.drawLine(10,150,10,190);
        FontMetrics metrices=g.getFontMetrics();
        l2.setText("Ascent " + metrices.getAscent() + ", Descent " + metrices.getDescent() + ", Leading "+ metrices.getLeading() + ", Height " + metrices.getHeight());
    }
    public static void main(String[] args){
        new NepalFlag();
    }
}