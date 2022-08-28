public class Calc {

    public static boolean isInsideOrOnCircle(Circle circle, Point point){
        Point center = circle.getCenter();
        double radius = circle.getRadius();

        double temp = Math.pow((point.getCoordinateX() - center.getCoordinateX()), 2);
        double temp2 = Math.pow((point.getCoordinateY() - center.getCoordinateY()), 2);

        return temp + temp2 <= Math.pow(radius, 2);

    }

}
