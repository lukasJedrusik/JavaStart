public class Drink {
    private Ingredient first;
    private Ingredient second;
    private Ingredient third;
    double drinkQuantity;

    public Drink(Ingredient first, Ingredient second, Ingredient third) {
        this.first = first;
        this.second = second;
        this.third = third;
        drinkQuantity = this.first.quantity + this.second.quantity + this.third.quantity;
    }



    public double countProporcion(Double drinkQuantity, Ingredient ingr){
        return ingr.getQuantity()/drinkQuantity;
    }

    public Drink() {
    }

    public double getDrinkQuantity() {
        return drinkQuantity;
    }

    public Ingredient getFirst() {
        return first;
    }

    public void setFirst(Ingredient first) {
        this.first = first;
    }

    public Ingredient getSecond() {
        return second;
    }

    public void setSecond(Ingredient second) {
        this.second = second;
    }

    public Ingredient getThird() {
        return third;
    }

    public void setThird(Ingredient third) {
        this.third = third;
    }
}
