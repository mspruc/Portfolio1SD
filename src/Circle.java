import java.awt.Point;
import java.awt.geom.Point2D;

public class Circle extends Shape {

    /**
     * Coordinates of the circles center.
     */
    public double x;
    public double y;

    public double radius;

    Circle(double radius) {
        super(0,0);
        this.radius = radius;
    }

    Circle(double centerX,double centerY, int radius){
        super(centerX,centerY);
        this.radius = radius;
        this.x = centerX;
        this.y = centerY;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void translate(Point p) {
        this.x += p.x;
        this.y += p.y;
    }

    @Override
    public boolean containsPoint(Point2D point) {
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x="               + x +
                ", y="             + y +
                ", radius="        + radius +
                ", area="          + getArea() +
                ", circumference=" + getCircumference() +
                '}';
    }
}
