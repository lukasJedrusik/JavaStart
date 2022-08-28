public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 0);
        Point p3 = new Point(5, 8);
        Point p4 = new Point(4, 5);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        double rectArea = rectangleArea(rectangle);
        System.out.println("Pole prostokąta to: " + rectArea);

    }
    public static double lineLength(Point start, Point end) {
        double xPow = Math.pow(end.getX() - start.getX(), 2);
        double yPow = Math.pow(end.getY() - start.getY(), 2);
        double xyPowSum = xPow + yPow;
        return Math.sqrt(xyPowSum);
    }

    public static double rectangleArea(Rectangle rectangle) {
        Point p1 = rectangle.getP1();
        Point p2 = rectangle.getP2();
        Point p3 = rectangle.getP3();
        Point p4 = rectangle.getP4();
        double sideA = lineLength(p1, p2);
        double sideB = lineLength(p1, p4);
        return sideA * sideB;
    }
}
