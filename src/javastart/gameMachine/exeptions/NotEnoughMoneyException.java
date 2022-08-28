package javastart.gameMachine.exeptions;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(int gameCost, int money) {
        System.out.println("Do zakupu gry brakuje:" + (gameCost - money));
    }


}
