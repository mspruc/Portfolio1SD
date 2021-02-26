import java.awt.Point;

public class Circle extends Shape {

    /**
     * Coordinates of the circles center.
     */
    public int x,y;

    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    Circle(Point p, int radius){
        this.radius = radius;
        this.x = p.x;
        this.y = p.y;
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
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void translate(Point p) {
        this.x += p.x;
        this.y += p.y;
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
