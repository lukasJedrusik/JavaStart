package javastart.gameMachine.dbo;

import javastart.gameMachine.exeptions.GameNotFoundException;
import javastart.gameMachine.exeptions.NotEnoughMoneyException;
import javastart.gameMachine.model.Game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameMachine {

    private static final GameMachine INSTANCE  = new GameMachine();

    List<Game> gameList = new ArrayList<>();

    private GameMachine() {
        this.gameList.add(new Game("Heroes 3", 20));
        this.gameList.add(new Game("The Witcher 3", 20));
        this.gameList.add(new Game("Halo", 20));
        this.gameList.add(new Game("NFS", 20));
        this.gameList.add(new Game("GTA IV", 20));
    }


    public List<Game> getGameList() {
        return gameList;
    }

    public Game buyGame(String gameTitle, int money){
        Game chosenGame = new Game();
        if (!showGameTitle().contains(gameTitle)){
            throw new GameNotFoundException(gameTitle);
        }
        for (int i = 0; i < gameList.size(); i++){
            if (gameList.get(i).getName().equals(gameTitle)){
                chosenGame = gameList.get(i);
                break;
            }
        }
        if (chosenGame.getPrice() > money){
            throw new NotEnoughMoneyException(chosenGame.getPrice(),money);
        }
        return chosenGame;
    }





    public List<String> showGameTitle(){
        ArrayList<String> titles = new ArrayList<>();
        for(Game element : gameList){
           titles.add(element.getName());
        }
        return titles;
    }


        public static GameMachine getInstance(){
        return INSTANCE;
        }


}

