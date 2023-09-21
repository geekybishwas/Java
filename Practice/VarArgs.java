public class VarArgs
{
static int sum(int ...arr)
{
int result=0;
for(int a:arr) result+=a;
return result;
}
public static void main(String[] args)
{
System.out.println("Sum of nothing is " + sum());
System.out.println("Sum of 1 and 2 is " + sum(1,2));
System.out.println("Sum of 1 ,2 and 3 is " + sum(1,2,3));
}
}