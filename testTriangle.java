package Lab09;

import java.util.Scanner;

public class testTriangle {
    public static void main(String[] args) {

        try {
            Triangle tri1 = new Triangle(3.0, 4.0, 5.0);
            System.out.println("Perimeter for T1: " + tri1.getPerimeter());
            System.out.println("Area for T1: " + tri1.getArea());

            Triangle tri2 = new Triangle(1, 2.0, 3.0);
            System.out.println("Perimeter for T1: " + tri2.getPerimeter());
            System.out.println("Area for T1: " + tri2.getArea());
            
        } catch (IllegalTriangleException e) {
            System.out.println("Illegal triangle");
            System.out.println("Side1: " + e.getSide1());
            System.out.println("Side2: " + e.getSide2());
            System.out.println("Side3: " + e.getSide3());
        }
    }
}
