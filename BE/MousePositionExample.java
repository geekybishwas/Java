import java.awt.*;
import java.awt.event.*;
public class MousePositionExample{
    public static void main(String[] args){
        Frame f=new Frame("Mouse Position Example");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        
        TextField status=new TextField(20);
        TextField coordinateF=new TextField(20);
        
        status.setEditable(false);
        coordinateF.setEditable(false);
        
        f.add(status);
        f.add(coordinateF);

        f.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e)
            {
                status.setText("Mouse Inside the frame");
            }

            public void mouseExited(MouseEvent e)
            {
                status.setText("Mouse outside the frame");
                coordinateF.setText("Out of the range, No coordinateFs");
            }
        });
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        
        });

        f.addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent e)
            {
                int x=e.getX();
                int y=e.getY();
                coordinateF.setText("X: "+ x + "Y: " + y);
            }
        });

    }
}
// import java.awt.*;
// import java.awt.event.*;

// public class MousePositionExample {
//     public static void main(String[] args) {
//         Frame frame = new Frame("Mouse Position Example");
//         frame.setSize(400, 200);
//         frame.setLayout(new FlowLayout());

//         TextField mouseStatusField = new TextField(20);
//         TextField coordinatesField = new TextField(20);

//         frame.add(mouseStatusField);
//         frame.add(coordinatesField);

//         frame.addMouseListener(new MouseAdapter() {
//             @Override
//             public void mouseEntered(MouseEvent e) {
//                 mouseStatusField.setText("Mouse Inside");
//             }

//             @Override
//             public void mouseExited(MouseEvent e) {
//                 mouseStatusField.setText("Mouse Outside");
//                 coordinatesField.setText("out of range");
//             }
//         });

//         frame.addMouseMotionListener(new MouseMotionAdapter() {
//             @Override
//             public void mouseMoved(MouseEvent e) {
//                 int x = e.getX();
//                 int y = e.getY();
//                 coordinatesField.setText("X: " + x + ", Y: " + y);
//             }
//         });

//         frame.setVisible(true);
//     }
// }