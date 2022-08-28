package javastart.gameMachine.model;

public class Game {

    private String name;
    private int price;

    public Game(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
