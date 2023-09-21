import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuBar extends JFrame implements ActionListener{
    JMenuBar mb;
    public MenuBar()
    {
        setVisible(true);
        setTitle("MENU BAR IN JSWING");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb=new JMenuBar();
        JMenu fm=new JMenu("File");
        JMenu em=new JMenu("Edit");
        JMenu hm=new JMenu("Help");
        mb.add(fm);
        mb.add(em);
        mb.add(hm);
        
        JMenuItem li=new JMenuItem("Load");
        JMenuItem si=new JMenuItem("Save");
        JMenuItem ei=new JMenuItem("Exit");

        fm.add(li);
        fm.add(si);
        fm.add(ei);
        setJMenuBar(mb);
    }

    public void actionPerformed(ActionEvent e)
    {

    }
    public static void main(String[] args){
        new MenuBar();
    }
}