package Assignment_01;
public class Exception3 {
    public static void main(String[] args) { 
        try{ 
            Class.forName("NewClass1");
        } 
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found"); 
        } 
    } 
}
