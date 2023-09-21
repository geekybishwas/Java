import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener{
    private LayoutManager Layout;
    private Choice Selector;

    public ChoiceDemo()
    {
        String [] ColorList;
        ColorList=new String[2];
        Layout=new FlowLayout();
        Selector =new Choice();
        ColorList[0]="Red";
        ColorList[1]="Blue";
        for(int i=0;i<2;i++)
        {
        Selector.insert(ColorList[i],i);
        }
        Selector.setBackground(Color.yellow);
        Selector.setForeground(Color.red);

        setLayout(Layout);
        add(Selector);

    }
    public static void main(String[] args){
    
    ChoiceDemo cd=new ChoiceDemo();
    cd.setVisible(true);
    cd.setSize(300,300);

    }
}