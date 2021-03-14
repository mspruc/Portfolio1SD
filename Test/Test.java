import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTests {

    @Test
    void rectangleTests(){
        //testing the null object pattern for rectangle and shape.
        Shape rectangle = new Rectangle();
        assertEquals(0,rectangle.calculateCenterX());
        assertEquals(0,rectangle.calculateCenterY());

        //contains testst :)
        Rectangle rectangle1 = new Rectangle(0,0,5,5);
        assertTrue(rectangle1.containsPoint(4.99,4.99));
        assertTrue(rectangle1.containsPoint(0.1,4.99));
        assertTrue(rectangle1.containsPoint(4.99,0.1));
        assertTrue(rectangle1.containsPoint(0.1,0.1));

        //scale circumference tests
        double tempCirc = rectangle1.getCircumference();
        rectangle1.scaleShape(2);
        assertEquals(tempCirc, rectangle1.getCircumference()/2);

    }

    @Test
    void circleTests(){
        //circle at 0,0 test
        Shape circle = new Circle(5);
        assertEquals(0,circle.calculateCenterX());
        assertEquals(0,circle.calculateCenterY());

        //circle at 3,3
        Shape circle1 = new Circle(3,3,5);
        assertEquals(3,circle1.calculateCenterX());
        assertEquals(3,circle1.calculateCenterY());

        //circle distance to eachother
        circle1.translate(0,-3);
        assertEquals(circle.distanceTo(circle1),3);

        //area circum
        Shape circle3 = new Circle(2);
        assertEquals(circle3.getArea(),circle3.getCircumference());

        //contains
        assertTrue(circle.containsPoint(0, 0));
        assertTrue(circle.containsPoint(4.99, 0));
    }

    @Test
    void triangleTests() {
        //get center tests
        Shape triangle = new Triangle(0, 0, 3, 0, 0, 3);
        assertEquals(triangle.calculateCenterX(), 1);
        assertEquals(triangle.calculateCenterY(), 1);

        //triangle and sort of rectangle getArea tests.
        Shape rectangle = new Rectangle(0, 0, 3, 3);
        assertEquals(rectangle.getArea() / 2, triangle.getArea());

        //circum tests
        Triangle triangle1 = new Triangle(0, 0, 3, 0, 0, 4);
        assertEquals(triangle1.getCircumference(), 12);

        //containspoint test
        assertTrue(triangle.containsPoint(0.1, 0.1));
        assertFalse(triangle.containsPoint(-0.1,-0.1));
        assertTrue(triangle.containsPoint(0.1, 0.1));
        assertTrue(triangle.containsPoint(1.4, 1.4));
        assertFalse(triangle.containsPoint(1.6,1.6));

        //scale test
        Triangle triangle2 = new Triangle();
        triangle2.scaleShape(3);
        assertEquals(triangle2.getArea(), 0);

        //scale circumference test
        double tempCirc = triangle1.getCircumference();
        triangle1.scaleShape(3);
        assertEquals(tempCirc,triangle1.getCircumference()/3);
    }
}