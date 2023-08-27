package oop_lab_report_1;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        double pi = 3.1416;
        double area;
        int r;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius");
        r = s.nextInt();
        area = pi*r*r;
        System.out.println("Area :"+area);
    }
    
}
