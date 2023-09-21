import java.awt.*;
import java.util.*;
public class DigitalClock extends Frame implements Runnable{
    Thread t;
    Calendar c;
    int h,m,s;
    DigitalClock()
    {
        c=Calendar.getInstance();
        h=c.get(c.HOUR_OF_DAY);
        m=c.get(c.MINUTE);
        s=c.get(c.SECOND);
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {   
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawString(String.format("%02d:%02d:%02d",h,m,s),50,50);
    }
    public void run()
    {
        while(true)
        {
            try{
                t.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error "+ e);
            }
            c=Calendar.getInstance();
            h=c.get(c.HOUR_OF_DAY);
            m=c.get(c.MINUTE);
            s=c.get(c.SECOND);
            repaint();
        }
    }
    public static void main(String [] args)
    {
        DigitalClock nf=new DigitalClock();
        nf.setVisible(true);
        nf.setSize(400,400);
    }
}
