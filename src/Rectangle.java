import java.awt.Point;

public class Rectangle extends Shape {
    /***
     * upperleft corner of the rectangle
     */
    public int x,y;

    /**
     * the rectangle's width and height.
     */
    public int width,height;

    /***
     * Creates a new rectangle with the 0,0 coordinate as its upper-left corner.
     * @param width the amount the rectangle extends along the x-axis relative to the upper-left corner
     * @param height the amount the rectangle extends along the y-axis relative to the upper-left corner
     */
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with point p as its upper-left corner.
     * @param p upper-left corner of the rectangle.
     * @param width the amount the rectangle extends along the x-axis relative to the upper-left corner
     * @param height the amount the rectangle extends along the y-axis relative to the upper-left corner
     */
    public Rectangle(Point p, int width, int height){
        this.x = p.x;
        this.y = p.y;
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
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with 0 side length at the 0,0 coordinate.
     */
    public Rectangle(){}

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getCircumference() {
        return this.width*2+this.height*2;
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
