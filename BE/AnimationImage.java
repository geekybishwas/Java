import java.awt.*;
public class AnimationImage extends Frame {
    static Image im[];
    static int numImages = 4;
    static int counter=0;
    AnimationImage () {
        super ("AnimationImage");
    }
    public static void main (String[] args) {
        Frame f = new AnimationImage();
        f.resize (400, 400);
        f.setVisible(true);
        im = new Image[numImages];
        for (int i=0;i<numImages;i++) {
            im[i] = Toolkit.getDefaultToolkit().getImage ("Clock"+i+".png");
        }
    }
    public synchronized void paint (Graphics g) {
        g.translate (insets().left, insets().top);
        g.drawImage (im[counter], 0, 0, this);
        counter++;
        if (counter == numImages)
            counter = 0;
        repaint (200);
    }
}
import java.awt.*;
public class AnimationImage extends Frame
{
    static Image im[];
    static int nI=4;
    static int counter=0;
    public static void main(String[] args)
    {
        Frame f=new Frame("Animation");
        f.setVisible(true);
        f.setSize(400,400);
        im=new Image[n1];
        for(int i=0;i<nI;i++)
        {
            im[i]=Toolkit.getDefaultToolkit().getImage("Clock"+i+".png");
        }
    }
    public synchronized void paint(Graphics g)
    {
        g.translate(insets().left,insets().top);
        g.drawImage(im[counter],0,0,this);
        counter++;
        if(counter==nI)
        {
            counter=0;
        }
        repaint(200);
    }
}
