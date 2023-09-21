class Maps
{
 void show()
 {
 System.out.println("Maps");
 }
}
class WebMaps extends Maps
{
 void show()
 {
 System.out.println("WebMaps");
 }
}
class PaperMaps extends Maps
{
 void show()
 {
 System.out.println("PaperMaps");
 }
}
public class upcasting{
public static void main(String[] args){
Maps m =new Maps();
WebMaps w =new WebMaps();
PaperMaps p =new PaperMaps();
w.show();
m.show();
m=w;
m.show();
}
}