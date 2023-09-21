public class ArrayMethod{
public static void main(String[] args)
{
int marks[]={12,423,13,41,145,523};
System.out.println(marks.length);
System.out.println("Displaying array elements:-");
for(int i=0;i<marks.length;i++) System.out.println(marks[i]);

//For Each method
System.out.println("Displaying using forEach method");
for(int element: marks) 
{
System.out.println(element);
}
}
}
