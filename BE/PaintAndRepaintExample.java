
import java.awt.*;
import java.awt.event.*;
public class PaintAndRepaintExample extends Frame implements ActionListener{
    int x=50;
    int y=50;
    Button b;
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillRect(x,y,50,50);
    }
    PaintAndRepaintExample()
    {   
        setLayout(new FlowLayout());
        b=new Button("Move");
        b.setBounds(50,50,50,50);
        // b.setFocusable(false);
        b.setFocusable(false);
        add(b);
        setVisible(true);
        setSize(400,400);
        b.addActionListener(this);
        setTitle("Paint and Repaint Example");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        move();
    }
    public void move()
    {
        x+=50;
        y+=50;
        repaint();
    }
    public static void main(String[] args){
        new PaintAndRepaintExample();
    }
}
