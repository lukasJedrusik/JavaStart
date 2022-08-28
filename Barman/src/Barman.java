public class Barman {

    Drink createDring(String ing1, int amount1, String ing2, int amount2, String ing3, int amount3){
        Ingredient ingrid1 = new Ingredient(ing1, amount1);
        Ingredient ingrid2 = new Ingredient(ing2, amount2);
        Ingredient ingrid3 = new Ingredient(ing3, amount3);
        Drink drink = new Drink(ingrid1, ingrid2, ingrid3);

        return drink;
    }

    public void printDrink(Drink drink){
        System.out.println("Składnik drinka to: " + drink.getFirst().getName() + ", "
                + drink.getSecond().getName() + ", " + drink.getThird().getName() + " w proporcjach: "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getFirst()) + ", "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getSecond()) + ", "
                + drink.countProporcion(drink.getDrinkQuantity(), drink.getThird()) + ". "
                + "Jego pojemność to: " + drink.getDrinkQuantity());


    }
}
