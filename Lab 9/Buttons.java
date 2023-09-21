// import java.io.*;
// // import java.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Buttons extends Frame{
//     Button b1,b2,b3;
//     Label l1,l2;
//     Buttons()
//     {
//         b1=new Button("Button 1");
//         b2=new Button("Button 2");
//         b3=new Button("Button 3");
//         setLayout(new BorderLayout());
//         add("North",b1);
//         add("South",b2);
//         add("East",b3);
//         l1=new Label("Label 1");
//         l2=new Label("Label 2");
//         l1.setBounds(20,20,40,40);
//         l2.setBounds(60,90,40,40);
//         add("Center",l1);
//         add("West",l2);
//         setSize(400,400);
//         setVisible(true);
//     }
//     public static void main(String[] args){
//         new Buttons();
//     }
// }

import javax.swing.*;
import java.awt.*;
public class Buttons{
public static void main(String[] args){
    JFrame f=new JFrame();
    f.setLayout(new BorderLayout());
    JPanel p1=new JPanel();
    p1.add(new JButton("Button 1"));
    JPanel p2=new JPanel();
    p2.add(new JButton("Button 2"));
    JPanel p3=new JPanel();
    p3.add(new JButton("Button 3"));
    JPanel p4=new JPanel();
    p4.add(new JLabel("Label 1"));
    JPanel p5=new JPanel();
    p5.add(new JLabel("Label 2"));
    f.setSize(400,400);
    f.setVisible(true);
    // f.add(p1);
    // f.add(p1);
    // f.add(p1);
    // f.add(p1);
    // f.add(p4);
    // f.add(p5);
    f.add(p1,BorderLayout.NORTH);
    f.add(p2,BorderLayout.CENTER);
    f.add(p3,BorderLayout.SOUTH);
    f.add(p4,BorderLayout.WEST);
    f.add(p5,BorderLayout.EAST);

    // f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}

// import javax.swing.JLabel;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JButton;
// import java.awt.BorderLayout;
	

// public class Buttons{
// 	public static void main(String[] args){
// 		JFrame frame = new JFrame();
// 		frame.setSize(300,150);
// 		frame.setLayout(new BorderLayout());
// 		JLabel label1 = new JLabel();
// 		JPanel panel1 = new JPanel();
// 		label1.setText("Label 1");
// 		panel1.add(label1);
// 		frame.add(panel1,BorderLayout.CENTER);
// 		JLabel label2 = new JLabel();
// 		JPanel panel2 = new JPanel();
// 		label2.setText("Label 2");
// 		panel2.add(label2);
// 		frame.add(panel2,BorderLayout.EAST);
// 		JPanel panel3 = new JPanel();
// 		panel3.add(new JButton("Button 1"));
// 		frame.add(panel3,BorderLayout.WEST);
// 		JPanel panel4 = new JPanel();
// 		panel4.add(new JButton("Button 2"));
// 		frame.add(panel4, BorderLayout.NORTH);
// 		JPanel panel5 = new JPanel();
// 		panel5.add(new JButton("Button 3"));
// 		frame.add(panel5,BorderLayout.SOUTH);
// 		frame.setVisible(true);
// 	}
// }