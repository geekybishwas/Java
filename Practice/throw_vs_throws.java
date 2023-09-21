class NegativeException extends Exception
{
    public String toString(){
        return " Radius can't negative";
    }
    public String getMessage()
    {
        return " Radius can't negative";
    }
}
public class throw_vs_throws{
    public static double area(int r) throws NegativeException
    {
        if(r<0)
        {
            throw new NegativeException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int r=a/b;
        return r;
    }
    public static void main(String[] args){
        
        try{
            int ll=divide(6,0);
            System.out.println(ll);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        try {
            double ar=area(-1);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}