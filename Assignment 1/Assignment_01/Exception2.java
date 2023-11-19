package Assignment_01;
public class Exception2 {
    public static void main(String args[]) 
    { 
        try{ 
            int x[] = new int[10]; 
            x[16] = 9;
        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
    } 
}
