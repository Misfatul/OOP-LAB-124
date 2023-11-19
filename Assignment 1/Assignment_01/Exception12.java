package Assignment_01;
public class Exception12 {
    public static void main(String args[]) 
    { 
        try { 
            String str = "Hello world ";
            char c = str.charAt(15); // accessing 16th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("String Index Out Of Bounds Exception"); 
        } 
    } 
}
