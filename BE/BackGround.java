import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class BackGround extends Frame implements ActionListener{
    Button b1,b2;
    public BackGround()
    {
        b1=new Button("Blue");
        b2=new Button("Green");
        b1.setBounds(10,10,60,60);
        b2.setBounds(30,10,60,60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        add(b1);
        add(b2);
        // setDefaultCloseOperation(3);
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        // if(e.getActionCommand().equals("Blue"))
        if(e.getSource()==b1)
        {
            setBackground(Color.BLUE);
        }
        // if(e.getActionCommand().equals("Green"))
        if(e.getSource()==b2)
        {
            setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args){
        new BackGround();
    }
}
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class BackGround extends JFrame implements ActionListener{
// 	JButton b1;
// 	JButton b2;
// 	BackGround(){
// 		b1= new JButton();
// 		b1.setText("RED");
// 		b1.setBounds(100,10,80,50);
// 		b1.addActionListener(this);

// 		b2= new JButton();
// 		b2.setText("BLUE");
// 		b2.setBounds(185,10,80,50);
// 		b2.addActionListener(this);

// 		this.setVisible(true);
// 		this.setSize(360,100);
// 		this.setLayout(null);
// 		this.setTitle("Java Application for testing");
// 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		this.add(b1);
// 		this.add(b2);
// 	}
// 	public void actionPerformed(ActionEvent ae){
// 		if (ae.getSource()==b1){
// 			// this.getContentPane().background(Color.red);
// 			this.getContentPane().setBackground(Color.RED);

// 		}else if(ae.getSource()==b2){
// 			this.getContentPane().setBackground(Color.BLUE);
// 		}
// 	}
// 	public static void main(String [] args){
// 		new BackGround();
// 	}
// }