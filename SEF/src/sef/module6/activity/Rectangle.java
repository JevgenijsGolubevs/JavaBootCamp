package sef.module6.activity;

public class Rectangle extends Shape{


    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea(){
        double area = height * width;
        return area;
    }
    public double calculatePerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

}
