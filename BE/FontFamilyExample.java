import java.awt.*;
import java.awt.event.*;
public class FontFamilyExample extends Frame implements ActionListener{
    Button  b;
    TextArea ta;
    FontFamilyExample()
    {
        b=new Button("Display");
        b.setBounds(10,5,50,50);
        ta=new TextArea(50,50);
        setTitle("Font Family");
        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());
        add(b,BorderLayout.CENTER);
        add(ta,BorderLayout.NORTH);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        String []fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0;i<10;i++)
        {
            ta.append(fonts[i]+"\n");
        }
    }
    public static void main(String[] args){
        new FontFamilyExample();
    }
}