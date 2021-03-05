import java.awt.Point;
import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    /***
     * upperleft corner of the rectangle
     */
    public double x,y;

    /**
     * the rectangle's width and height.
     */
    public double width,height;

    /***
     * Creates a new rectangle with the 0,0 coordinate as its upper-left corner.
     * @param width the amount the rectangle extends along the x-axis relative to the upper-left corner
     * @param height the amount the rectangle extends along the y-axis relative to the upper-left corner
     */
    public Rectangle(double width, double height){
        super(0,0);
        this.width = width;
        this.height = height;
    }


    /**
     * Creates a rectangle with x and y variables as its upper-left corner.
     * @param x the x coordinate of the upper-left corner.
     * @param y the y coordinate of the upper-left corner.
     * @param width the amount the rectangle extends along the x-axis relative to the upper-left corner
     * @param height the amount the rectangle extends along the y-axis relative to the upper-left corner
     */
    public Rectangle(double x, double y, double width, double height){
        super(0,0);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with 0 side length at the 0,0 coordinate.
     */
    public Rectangle(){
        super(0,0);
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getCircumference() {
        return this.width*2+this.height*2;
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

    public Point[] getCornerPoints(){
        return null;
    }

    @Override
    public String toString(){
        return "Rectangle([Center = (" + x + "," + y + ")]" +
                         "[width = "   + width       +  "]" +
                         "[height = "  + height      +  "]" +
                         "[area = "    + getArea()   +  "]" +
                          ")";
    }
}
