package Assignment_01;
public class Exception {
     public static void main(String args[]) 
    { 
        try { 
            int x = 30;
            int y = 0; 
            int z = x/y;  // can't divide by zero 
            System.out.println ("Result = " + z); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Arithmetic Exception Occurred"); 
        } 
    }
}
