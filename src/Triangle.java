public class Triangle extends Shape{
    public double x1;
    public double x2;
    public double x3;
    public double y1;
    public double y2;
    public double y3;

    /**
     * Constructs a triangle at 0,0 with 0 side length.
     */
    Triangle() {
    }

    /**
     * Creates a triangle by 3 defined points.
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param x2 x coordinate of the second point
     * @param y2 y coordinate of the second point
     * @param x3 x coordinate of the third point
     * @param y3 y coordinate of the third point
     */

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getArea() {
        return areaCalc(this.x1,this.y1,this.x2,this.y2,this.x3,this.y3);
    }

    private double areaCalc(double x1, double y1, double x2, double y2, double x3, double y3){
        double divisor = 2;
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/divisor);
    }

    @Override
    public double calculateCenterX(){
        return (x1+x2+x3)/3d;
    }

    @Override
    public double calculateCenterY(){
        return (y1+y2+y3)/3d;
    }

    @Override
    public double getCircumference() {
        return Math.abs(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))) +
                Math.abs(Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2))) +
                Math.abs(Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2)));
    }

    @Override
    public void translate(double x, double y) {
        this.x1 += x;
        this.y1 += y;
        this.x2 += x;
        this.y2 += y;
        this.x3 += x;
        this.y3 += y;
    }

    /**
     * Scale triangle according to its center
     * @param scalar the magnitude you want to scale the triangle by
     */
    @Override
    public void scaleShape(double scalar) {
        double[] p1 = scalePoint(scalar,x1,y1);
        double[] p2 = scalePoint(scalar,x2,y2);
        double[] p3 = scalePoint(scalar,x3,y3);

        x1 = p1[0];
        y1 = p1[1];
        x2 = p2[0];
        y2 = p2[1];
        x3 = p3[0];
        y3 = p3[1];
    }

    @Override
    public boolean intersects(Shape shape1) {
        return false;
    }

    private double[] scalePoint(double scalar, double x, double y) {
        //get the vector from the center to the coordinate
        double tempX = x - calculateCenterX();
        double tempY = y - calculateCenterY();

        //scale it with the scalar
        tempX *= scalar;
        tempY *= scalar;

        //add the new vector to the center
        tempX += calculateCenterX();
        tempY += calculateCenterY();

        return new double[]{tempX, tempY};
    }

    @Override
    public boolean containsPoint(double x, double y) {
        double triangleArea = this.getArea();
        double area1 = areaCalc(x,y,this.x2,this.y2,this.x3,this.y3);
        double area2 = areaCalc(this.x1,this.y1,x,y,this.x3,this.y3);
        double area3 = areaCalc(this.x1,this.y1,this.x2,this.y2,x,y);

        return triangleArea == area1 + area2 + area3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                ", area=" + getArea() +
                ", circumference=" + getCircumference() +
                '}';
    }
}
