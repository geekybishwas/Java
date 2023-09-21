import java.awt.*;
import java.awt.event.*;
public class LabelEx extends Frame{
    Label l1;
    Label l2;
    Label l3;

    public LabelEx()
    {   
        l1=new Label("A Simple Label");
        l2=new Label("A label with left alignment", Label.LEFT);
        l3=new Label("A label with CENTER alignment", Label.CENTER);

        add(l1);
        add(l2);
        add(l3);

        l2.setBackground(Color.yellow);
        l3.setForeground(Color.red);
        setLayout(new GridLayout(4,1));
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new LabelEx();
    }
}