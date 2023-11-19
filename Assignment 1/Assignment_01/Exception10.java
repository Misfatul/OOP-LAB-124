package Assignment_01;
public class Exception10 {
    public static void main(String args[]) 
    { 
        try { 
            int num = Integer.parseInt ("hgkjh") ; 
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number Format Exception"); 
        } 
    } 
}
