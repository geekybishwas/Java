public class throwingException{
public static void validate_gpa(double gpa)
{
if((gpa>4) || (gpa<0)){
throw new ArithmeticException("The gpa not valid");
}
else
{
System.out.println("The gpa valid");
}
}
public static void main(String[] args){
double mygpa=5;
validate_gpa(mygpa);
}
}