import java.awt.*;

public class TestClass{
    TestClass(){
        Rectangle zeroRectangle = new Rectangle();
        Rectangle rectangle = new Rectangle(2,2,2,2);
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(12,8,7,11,4,5);
        Triangle triangle2 = new Triangle(7,11,12,8,4,5);
        Circle circle = new Circle(2);
        Shape[] shapes = {zeroRectangle,rectangle,triangle,circle,triangle1};


        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        //unit test for containing a point
        if (rectangle.containsPoint(new Point(2,2))) {
            System.out.println("containsPoint test verified");
        } else {
            System.out.println("containsPoint test failed");
        }

        //circle circumference and area test
        if (circle.getCircumference() == circle.getArea()){
            System.out.println("area and circumference for circle verified");
        } else {
            System.out.println("area and circumference for circle failed");
        }

        //test for triangles area
        if(triangle1.getArea() == 19.5 && triangle2.getArea() == 19.5){
            System.out.println("triangle area verified");
        } else {
            System.out.println("triangle area failed");
        }
        areaTestTriangle();

    }

    void areaTestTriangle(){
        Triangle triangle1 = new Triangle(12,8,7,11,4,5);
        Triangle triangle2 = new Triangle(7,11,12,8,5,5);

        assert triangle2.getArea() == 19.5 : "Triangle area calculation failed.";
    }
}