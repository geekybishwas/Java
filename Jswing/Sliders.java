import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sliders implements ChangeListener{
    JFrame f;
    JPanel p;
    JLabel l;
    JSlider s;
    Sliders()
    {
        f=new JFrame("SLIDER DEMO");
        p=new JPanel();
        l=new JLabel();
        s=new JSlider(0,100,50); //min,max,half
        s.setPreferredSize(new Dimension(400,200));
        // s.setPaintTicks(true);
        // s.setMinorTickSpacing(10);

        s.setPaintTrack(true);
        s.setMajorTickSpacing(25);

        s.setPaintLabels(true);
        s.setFont(new Font("MV Boli",Font.PLAIN,15));
        s.addChangeListener(this);
        p.add(s);
        p.add(l);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public void stateChanged(ChangeEvent e)
    {
        l.setText("Degree = " + s.getValue());
    }
    public static void main(String[] args){
        new Sliders();
    }
}