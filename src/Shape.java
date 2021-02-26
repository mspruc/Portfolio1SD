import java.awt.*;
import java.awt.geom.Point2D;

abstract class Shape <Integer>{
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int centerX;
    public int centerY;

    protected Shape (){

    }

    //TODO make these guys doubles.
    public abstract double getArea();
    public abstract double getCircumference();

    /***
     * Translates the center of the shape according to the given point.
     * @param x moving the shape along the x-axis
     * @param y moving the shape along the y-axis
     */
    public abstract void translate(int x, int y);

    /***
     * Translates the center of the shape according to the given point.
     * @param p moves the shape with p as its new anchor.
     */
    public abstract void translate(Point p);

    public void scaleShape(int scalar){}

    public void rotate(int unitDegree){}

    public boolean intersects (Shape shape1) {
        return false;
    }

    public int distanceTo(Shape shape1){return 0;}

    public boolean containsPoint (Point2D point) {
        return false;
    }


}
