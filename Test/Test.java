import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTests {

    @org.junit.jupiter.api.Test
    void rectangleTests(){
        //testing the null object pattern for rectangle and shape.
        Shape rectangle = new Rectangle();

        assertEquals(0,rectangle.getCenterX());
        assertEquals(0,rectangle.getCenterY());

        //
    }

    @Test
    void circleTests(){
        Shape circle = new Circle(5);
        assertEquals(0,circle.getCenterX());
        assertEquals(0,circle.getCenterY());

        Shape circle1 = new Circle(3,3,5);

        assertEquals(3,circle1.getCenterX());
        assertEquals(3,circle1.getCenterY());
    }
}