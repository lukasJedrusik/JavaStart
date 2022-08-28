//Napisz program, w którym użytkownik podaje liczbę całkowitą,
// a następnie w konsoli rysowany jest romb, którego boki składają się z tylu gwiazdek co liczba zadana w programie.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita: ");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        romb(counter);

    }

    public static void romb(int counter){
        int startaposition = counter;
        for(int i = 0; i < counter; i++){
            for (int j = 1; j < startaposition; j++) {
                System.out.print(" ");
            }
         /*   for (int x = startaposition; i < (startaposition + counter); x++){
                System.out.println("*");
            }*/
            for (int x = 0; x < counter; x++){
                System.out.print("*");
            }
            System.out.println();
            startaposition--;
        }
    }
}
