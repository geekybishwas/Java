import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBoxExample extends JFrame implements ActionListener{
    JComboBox cb;
    ComboBoxExample()
    {
        String [] animals={"dog","cat","bird"};
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        cb=new JComboBox(animals);
        cb.addActionListener(this);
        cb.addItem("horse");
        add(cb);
        setLayout(new FlowLayout()); 
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==cb)
        {
            System.out.println(cb.getSelectedItem());
            // System.out.println(cb.getSelectedIndex());
        }
    }
    public static void main(String[] args){
        new ComboBoxExample();
    }
}