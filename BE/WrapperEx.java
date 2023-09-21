import java.io.*;
import java.util.*;
public class WrapperEx{
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Wrapping
        
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        
        int unwrappedInt = wrappedInt.intValue(); // Unwrapping
        System.out.println("Unwrapped int: " + unwrappedInt);
        
        Integer nullWrapper = null; // Wrapper can be null
        System.out.println("Null wrapper: " + nullWrapper);
    }
}