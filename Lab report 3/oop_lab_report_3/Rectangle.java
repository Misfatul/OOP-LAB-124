package oop_lab_report_3;
public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerameter(){
        return 2*(length+width);
    }
}
