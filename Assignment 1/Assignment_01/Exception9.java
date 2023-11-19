package Assignment_01;
public class Exception9 {
   public static void main(String args[]) 
    { 
        try { 
            String str = null; //null value 
            System.out.println(str.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("Null Pointer Exception.."); 
        } 
    }  
}
