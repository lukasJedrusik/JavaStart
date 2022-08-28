import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc skladników: ");
        int quantity = scan.nextInt();
        Drink drink = Barman.createDring(quantity);
        Barman.printDrink(drink);

    }
}
