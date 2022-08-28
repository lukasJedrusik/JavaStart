package javastart.gameMachine.exeptions;

public class GameNotFoundException extends RuntimeException{
       public GameNotFoundException(String gameTitle){
           //super("Nie odnaleziono gry: "+ gameTitle);
           System.out.println("Nie odnaleziono gry: "+ gameTitle);
       }
}
