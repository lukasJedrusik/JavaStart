public class Drink {
    private Ingredient[] ingredients;
    double drinkQuantity;

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getDrinkQuantity() {
        return drinkQuantity;
    }

    public void setDrinkQuantity(double drinkQuantity) {
        this.drinkQuantity = drinkQuantity;
    }

    public Drink(Ingredient[] ingredients){
        this.ingredients = ingredients;
        for (int i = 0; i < ingredients.length; i++){
            this.drinkQuantity += ingredients[i].getQuantity();
        }

    }


    public double countProporcion(Double drinkQuantity, Ingredient ingr) {
        return ingr.getQuantity() / drinkQuantity;
    }

    public Drink() {
    }

    ;
}


