import java.applet.*;
import java.awt.*;

public class LoadImage extends Applet{
    Image img;
    public void init()
    {
       img = getImage(getCodeBase(), "Clock1.png");
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(img,50,80,this);
    }
}
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
    <applet code ="ImageApplet" width = 500 height = 500 ></applet>
</body>
</html>