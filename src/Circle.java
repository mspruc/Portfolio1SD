public class Circle extends Shape {
    public double x;
    public double y;

    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * create a circle at a point with a radius
     * @param centerX x coordinate of the circles center
     * @param centerY y coordinate of the circles center
     * @param radius radius of the circle
     */
    Circle(double centerX,double centerY, int radius){
        this.radius = radius;
        this.x = centerX;
        this.y = centerY;
    }

    @Override
    public double calculateCenterX() {
        return x;
    }

    @Override
    public double calculateCenterY() {
        return y;
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
    public void scaleShape(double scalar) {

    }

    @Override
    public boolean intersects(Shape shape1) {
        return false;
    }


    @Override
    public boolean containsPoint(double x, double y) {
        return Math.pow(x - calculateCenterX(), 2) + Math.pow(y - calculateCenterY(), 2) < Math.pow(radius, 2);
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
