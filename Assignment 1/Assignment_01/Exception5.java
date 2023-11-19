package Assignment_01;
import java.util.Scanner;
public class Exception5 {
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner("Hello World!"); 
        System.out.println("" + scan.nextLine()); 
        // Check if there is an IO exception 
        System.out.println("Exception Output: "
                           + scan.ioException());
    }  
}
