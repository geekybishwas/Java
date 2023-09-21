import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldExample extends JFrame implements ActionListener{
    JButton b=new JButton("Submit");
    JTextField tf;
    TextFieldExample()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new GridLayout(3,2,5,10)); 
        setVisible(true);
        tf=new JTextField();
        tf.setPreferredSize(new Dimension(250,40));
        add(tf);
        pack();
        add(b);
        tf.setFont(new Font("Consolas",Font.PLAIN,35));
        tf.setForeground(Color.green);
        b.setPreferredSize(new Dimension(50,50));
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            System.out.println(tf.getText());
        }
    }
    public static void main(String[] args){
        new TextFieldExample();
    }
}