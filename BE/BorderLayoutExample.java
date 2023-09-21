// import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutExample extends Frame{
    BorderLayoutExample()
    {   
        setTitle("BORDER LAYOUT");
        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());
        add("North",new Button("North"));
        add("South",new Button("South"));
        add("Center",new Button("Center"));
        add("West",new Button("West"));
        add("East",new Button("East"));
    }
    public static void main(String[] args){
        new BorderLayoutExample();
    }
}