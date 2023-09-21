import java.awt.*;
import java.awt.event.*;
public class ShapeChoose extends Frame implements ItemListener{
    Choice sp;
    RectangleClass rect;
    CircleClass cir;
    SquareClass sq;
    public ShapeChoose()
    {
        super("Shape Demo");
        setSize(400,400);
        setVisible(true);
        rect=new RectangleClass();
        cir=new CircleClass();
        sq=new SquareClass();
        sp=new Choice();
        sp.add("Rectangle");
        sp.add("Circle");
        sp.add("Square");
        setLayout(new FlowLayout());
        add(sp);
        sp.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String s=sp.getSelectedItem();
        if(s.equals("Rectangle")){
            rect.setVisible(true);
        }
        if(s.equals("Circle")){
            cir.setVisible(true);
        }
        if(s.equals("Square")){
            sq.setVisible(true);
        }
    }
    public static void main(String[] args){
        new ShapeChoose();  
    }
    class RectangleClass extends Frame{
        public RectangleClass()
        {
            setSize(300,300);
        }
            public void paint(Graphics g)
            {
                super.paint(g);
                g.fillRect(60,60,150,100);
            }

    }
    class CircleClass extends Frame{
        public CircleClass()
        {
            setSize(300,300);
        }
            public void paint(Graphics g)
            {
                super.paint(g);
                g.fillOval(50,60,150,100);
            }
    }
    class SquareClass extends Frame{
        public SquareClass()
        {
            setSize(300,300);
        }
            public void paint(Graphics g)
            {
                super.paint(g);
                g.fillRect(60,60,150,100);
            }
    }
}
