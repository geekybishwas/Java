
import java.awt.*;
import java.awt.event.*;
public class TextListenerExample extends Frame implements TextListener{
    TextArea ta;
    TextArea ta1;
    
    public TextListenerExample()
    {
        ta=new TextArea(2,40);
        ta1=new TextArea(2,40);
        setLayout(new FlowLayout());
        add(ta);
        ta1.setEditable(false);
        ta.addTextListener(this);
        add(ta1);
        setSize(400,400);
        setVisible(true);
        ta.setText("Enter the txt");
    }

    public void textValueChanged(TextEvent e)
    {
        String e1;
        e1=ta.getText();
        ta1.setText(e1);    
    }
    public static void main(String[] args){
        new TextListenerExample();
    }
}