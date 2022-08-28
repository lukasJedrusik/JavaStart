package javastart.gameMachine;

import javastart.gameMachine.dbo.GameMachine;
import javastart.gameMachine.exeptions.GameNotFoundException;
import javastart.gameMachine.exeptions.NotEnoughMoneyException;
import javastart.gameMachine.model.Game;

import java.util.Scanner;

public class GameMachineController {
    public static void main(String[] args) {
        GameMachine gameMachine = GameMachine.getInstance();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        Scanner sc = new Scanner(System.in);
        String gameTitle;
        int money;

       // gameMachine.showGameList();
        System.out.println();
        System.out.println("Podaj tytuł gry:");
        gameTitle = sc.nextLine();
        System.out.println("Wpłać pieniądze:");
        money = sc.nextInt();

        try{

           Game game = gameMachine.buyGame(gameTitle, money);
           System.out.println("Kupiłęś gre: " + game.getName());
           System.out.println("Odbierz reszte: " + (money -game.getPrice()));
        } catch (GameNotFoundException | NotEnoughMoneyException e){
           // System.out.println(e.getMessage());
        }





    }
}
