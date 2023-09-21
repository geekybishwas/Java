import javax.swing.*;
import java.awt.event.*;
public class MyEvent extends JFrame{
    JButton b1;
    public MyEvent()
    {
        super("MyEvent Window");
        b1=new JButton("Click Me");

        //Get the Content pane to add components
        getContentPane().add(b1);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(3);
        ButtonListener listen=new ButtonListener();
        b1.addActionListener(listen);
    }
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton source=(JButton) e.getSource();
            source.setText("Button Clicked");
        }
    }
    public static void main(String[] args){
        MyEvent event=new MyEvent();
    }
}