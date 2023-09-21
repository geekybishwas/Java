import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ItemListenerExample extends Frame implements ItemListener{
    Choice c;
    ItemListenerExample()
    {    
        c=new Choice();
        setBackground(Color.red);
        c.setForeground(Color.black);
        c.setBackground(Color.yellow);
        c.setFont(new Font("MV Boli",Font.PLAIN,15));
        add(c);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String [] colorList={"Red","Blue","Green","Orange","Black","White"};
        for(int i=0;i<colorList.length;++i)
        {
            c.insert(colorList[i],i);
        }
        c.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        int s;
        s=c.getSelectedIndex();
        if(s==0)
        {
            setBackground(Color.red);
        }
        else if(s==1)
        {
            setBackground(Color.blue);

        }
        else if(s==2){
            setBackground(Color.green);
        }
        else if(s==3)
        {
            setBackground(Color.orange);
        }
        else
        {
         setBackground(Color.black);
        }
    }
    public static void main(String[] args){
        new ItemListenerExample();
    }
}