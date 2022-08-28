public class Rectangle {

    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }
    //|AB|=(x2−x1)2+(y2−y1)2√
    public double section(Point a, Point b){
        double section = Math.sqrt(Math.pow((b.getCoordinateX()  - a.getCoordinateX()), 2) + Math.pow((b.getCoordinateY()  - a.getCoordinateY()), 2));
        return section;
    }

    public double surfaceArea(){
        double sideA = section(pointA, pointB);
        double sideB = section(pointB, pointC);
        return sideA * sideB;

    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }


}
