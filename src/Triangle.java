import java.awt.Point;

public class Triangle extends Shape{

    public int x1,x2,x3;
    public int y1,y2,y3;

    Triangle() {
        int width = 0;
        int height = 0;
    }

    Triangle(Point p1, Point p2, Point p3){
        this.x1 = p1.x;
        this.y1 = p1.y;
        this.x2 = p2.x;
        this.y2 = p2.y;
        this.x3 = p3.x;
        this.y3 = p3.y;
    }

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
        double divisor = 2;
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/divisor);
    }

    @Override
    public double getCircumference() {
        return Math.abs(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))) +
                Math.abs(Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2))) +
                Math.abs(Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2)))
                ;
    }

    @Override
    public void translate(int x, int y) {
        this.x1 += x;
        this.y1 += y;
        this.x2 += x;
        this.y2 += y;
        this.x3 += x;
        this.y3 += y;
    }

    @Override
    public void translate(Point p) {
        this.x1 += p.x;
        this.y1 += p.y;
        this.x2 += p.x;
        this.y2 += p.y;
        this.x3 += p.x;
        this.y3 += p.y;
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
