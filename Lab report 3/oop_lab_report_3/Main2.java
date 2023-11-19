package oop_lab_report_3;
public class Main2 {
     public static void main(String[] args) {
	Triangle triangle = new Triangle(15,30 );
        System.out.println("Base:"+triangle.base);
        System.out.println("Height:"+triangle.height);
        System.out.println("Area of the Triangle: " + triangle.getArea());
     }
}
