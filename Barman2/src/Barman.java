import java.util.Scanner;

public class Barman {

    public static Drink createDring(int ingriedientsNumber){
        Scanner scan = new Scanner(System.in);
        String nazwa;
        int quantity;
        Ingredient[] ingredients = new Ingredient[ingriedientsNumber];
       for (int i = 0; i < ingriedientsNumber; i++){
           System.out.println("Podaj nazwe skladnika:");
           nazwa = scan.nextLine();
           //ingredients[i].setName(nazwa);
           System.out.println("Podaj ilosc w ml:");
           quantity = scan.nextInt();;
          // ingredients[i].setQuantity(quantity);
           ingredients[i] = new Ingredient(nazwa, quantity);
           scan.nextLine();

       }
        Drink drink = new Drink(ingredients);

        return drink;
    }

    public static  void printDrink(Drink drink){
        int ingriedientsNumber = drink.getIngredients().length;
        System.out.println("Drink sklada sie z " + ingriedientsNumber +" skladników :" );
        for (int i = 0; i < ingriedientsNumber ;i++){
            System.out.println(drink.getIngredients()[i].getName() +" (" + drink.getIngredients()[i].getQuantity() + ")");
        }



        /*    System.out.println("Składnik drinka to: " + drink.getFirst().getName() + ", "
                + drink.getSecond().getName() + ", " + drink.getThird().getName() + " w proporcjach: "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getFirst()) + ", "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getSecond()) + ", "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getThird()) + ". "
                + "Jego pojemność to: " + drink.getDrinkQuantity());*/


    }
}
