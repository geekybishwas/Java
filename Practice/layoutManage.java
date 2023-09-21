import java.awt.*;
public class layoutManage extends Frame{
    private LayoutManager Layout;
    private Label Label1;
    private Label Label2;
    private Label Label3;
    public layoutManage()
    {
        //Instantiation
        Layout=new GridLayout(7,1);
        Label1=new Label("A simple Label");
        Label2=new Label("A label with left alignment" ,Label.LEFT);
        Label3=new Label("A label with center alignment ",Label.CENTER);

        //Location
        setLayout(Layout);
        add(Label1);
        add(Label2);
        add(Label3);

        //dECORATION
        Label2.setBackground(Color.yellow);
        Label3.setBackground(Color.red);
        Label1.setForeground(Color.blue);

    }
    public static void main(String[] args){
    layoutManage lm=new layoutManage();
    lm.setVisible(true);
    lm.setSize(400,300);
    }
}