public class Main {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink pinacolada =  barman.createDring("Sok ananasowy", 50, "Malibu", 100, "Mleko kokosowe", 100);
        barman.printDrink(pinacolada);
        System.out.printf("%s,: %d - %.3f", "String", 5, 3.5565874);
        //System.out.printf("%s %d  %.3f", "String", 5, 3.556);
    }
}
