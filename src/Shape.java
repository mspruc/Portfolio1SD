import java.awt.*;
import java.awt.geom.Point2D;

abstract class Shape {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    private double centerX;
    private double centerY;

    protected Shape (double centerX, double centerY){
        this.centerY = centerY;
        this.centerX = centerX;
    }

    //TODO make these guys doubles.
    public abstract double getArea();
    public abstract double getCircumference();

    /***
     * Translates the center of the shape according to the given point.
     * @param x moving the shape along the x-axis
     * @param y moving the shape along the y-axis
     */
    public abstract void translate(double x, double y);

    /***
     * Translates the center of the shape according to the given point.
     * @param p moves the shape with p as its new anchor.
     */
    public abstract void translate(Point p);

    public void scaleShape(double scalar){
    }

    public void rotate(int unitDegree){}

    public boolean intersects (Shape shape1) {
        return false;
    }

    public double distanceTo(Shape shape1){return Math.sqrt(Math.pow(shape1.centerX-centerX,2)+Math.pow(shape1.centerY-centerY,2));}

    public abstract boolean containsPoint (Point2D point);
}
