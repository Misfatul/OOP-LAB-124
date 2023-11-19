package oop_lab_report_2;
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[]args){
        int a,digits=0,whitespace=0,letters=0;
        Scanner p = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = p.nextLine();
        a=password.length();
        if(a>10){
            for(int i=0;i<a;i++){
                char ch = password.charAt(i);
                if(!Character.isDigit(ch)&&!Character.isLetter(ch)&&!Character.isWhitespace(ch)){
                    break;
                }
                else{
                    if(Character.isDigit(ch)){
                    digits++;
                }
                    else if(Character.isWhitespace(ch)){
                    whitespace++;
                }
                    else if(Character.isLetter(ch)){
                    letters++;
                }
                }
            }
        }
        if(a>10&&digits>=2&&whitespace>=1&&letters>=1){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is invalid");
        }
    }
}
