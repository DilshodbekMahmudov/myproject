package myproject;

public class TriangleSide {

    public static void main(String[] args) {

        Triangle triangle=new Triangle(5.0,3.0,4.0);

        double side1 = triangle.getSide1();
        double side2 = triangle.getSide2();
        double side3 = triangle.getSide3();

        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);

    }
}
