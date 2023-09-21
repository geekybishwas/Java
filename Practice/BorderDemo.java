import java.awt.*;
public class BorderDemo extends Frame{
    super(title);
    setLayout(new BorderLayout());
    add("North",new Button("North"));
    add("South",new Button("South"));
    add("East",new Button("East"));
    add("West",new Button("West"));
    add("Center",new Button("Center"));
public static void main(String[] args){
    BorderDemo b=new BorderDemo("BorderLayouTdeMO");
    b.setSize(300,200);
    b.setVisible(true);
}
}