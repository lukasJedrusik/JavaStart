//Każdy prostokąt opisany jest przez cztery wierzchołki w przestrzeni, natomiast koło przez punkt w przestrzeni będący jego środkiem oraz długość promienia.
//
//Napisz program, w którym będzie możliwość obliczenia pola powierzchni dowolnego prostokąta oraz możliwość sprawdzenia, czy zadany punkt leży wewnątrz lub na okręgu.
//
//Program napisz z wykorzystaniem podejścia obiektowego, tzn. wydziel osobne klasy dla punktów, prostokąta, koła, kalkulatora oraz osobną klasę testową.
//
//Zagadnienia przydatne do rozwiązania: definiowanie klas, metod i obiektów.


public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(2,3),
                                             new Point(6,0),
                                              new Point(5,8),
                                             new Point(4,5));

        System.out.printf("%.2f",rectangle.surfaceArea());


        Point point = new Point(0,0);
        Circle circle = new Circle(point,5);
        Point isOk = new Point(0,3);
        Point isNotOk = new Point(0,8);
        System.out.println();
        System.out.println(Calc.isInsideOrOnCircle(circle, isOk));
        System.out.println(Calc.isInsideOrOnCircle(circle,isNotOk));

    }
}
