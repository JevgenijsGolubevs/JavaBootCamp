package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape p1 = new Square(5);
        Shape p2 = new Rectangle(8, 10);
        Shape p3 = new Circle(4, 3.14);

        p1.setColor("Red");
        p2.setColor("Yellow");
        p3.setColor("Violet");


        System.out.println("*** Print the information for square");
        System.out.println("Color of square " + p1.getColor());
        System.out.println("Area of square: " + p1.calculateArea());
        System.out.println("Perimeter of square: " + p1.calculatePerimeter());

        System.out.println("*** Print the information for rectangle");
        System.out.println("Color of square " + p2.getColor());
        System.out.println("Area of square: " + p2.calculateArea());
        System.out.println("Perimeter of square: " + p2.calculatePerimeter());

        System.out.println("*** Print the information for circle");
        System.out.println("Color of square " + p3.getColor());
        System.out.println("Area of square: " + p3.calculateArea());

    }
}
