
import java.awt.*;
public class SmileyFace extends Frame{
    public SmileyFace(){
        setSize(400,400);
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(95, 105, 15, 25);
        
        g.fillOval(185, 105, 15, 25);

        int x = 100;
        int y = 160;
        int width = 100;
        int height = 50;
        int startAngle = 180;
        int arcAngle = -180;

        g.drawArc(x, y, width, height, startAngle, arcAngle);
        
        }
    public static void main(String[] args) {
        new SmileyFace().setVisible(true);
    }
}