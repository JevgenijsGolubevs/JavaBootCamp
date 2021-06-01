package sef.module6.activity;

public class Circle extends Shape{

    private double radiuss;
    private double pi;

    public Circle(double radiuss, double pi) {
        this.radiuss = radiuss;
        this.pi = pi;
    }
    public double calculateArea() {
        double area = radiuss * radiuss * pi;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
