abstract class Shape {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculateCenterX();

    public abstract double calculateCenterY();

    protected Shape (){

    }

    public abstract double getArea();

    public abstract double getCircumference();

    /**
     * Translates the center of the shape according to the given point.
     * @param x moving the shape along the x-axis
     * @param y moving the shape along the y-axis
     */
    public abstract void translate(double x, double y);

    public abstract void scaleShape(double scalar);

    public void rotate(int unitDegree){}

    public abstract boolean intersects (Shape shape1);
    public abstract boolean intersects (Rectangle shape1);
    public abstract boolean intersects (Triangle shape1);
    public abstract boolean intersects (Circle shape1);

    /**
     * Distance from one shape to another
     * @param shape1 any given shape
     * @return returns the distance as a double
     */
    public double distanceTo(Shape shape1){return Math.sqrt(Math.pow(shape1.calculateCenterX()- calculateCenterX(),2)+Math.pow(shape1.calculateCenterY()- calculateCenterY(),2));}

    public double distanceTo(double x, double y){return Math.sqrt(Math.pow(x- calculateCenterX(),2)+Math.pow(y- calculateCenterY(),2));}



    public abstract boolean containsPoint(double x, double y);


}
