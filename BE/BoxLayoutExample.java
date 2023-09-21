import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
        public BoxLayoutExample()
        {
            JFrame frame = new JFrame("BoxLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel p=new JPanel();
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            JButton button3 = new JButton("Button 3");

            p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
            p.add(button1);
            p.add(button2);
            p.add(button3);
            frame.add(p);
            frame.setSize(400,400);
            frame.pack();
            frame.setVisible(true);
        }
    public static void main(String[] args) {
            new BoxLayoutExample();
        }
}