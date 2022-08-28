import java.util.Scanner;

//Wczytaj od użytkownika dowolną liczbę całkowitą różną od 0. Jeżeli liczba jest większa od 0 wyświetl na ekranie wszystkie liczby z przedziału [0, N], g
// gdzie N jest liczbą podaną przez użytkownika z odstępem co 0.1. Jeśli liczba jest mniejsza od 0 wyświetl liczby od 0 do N (w porządku malejącym).
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        if (s > 0){
           // double i = (double)s/10;
            for (double i = 0; i <=s + 0.1;i = i + 0.1 ){
                System.out.printf("%.1f",i);
                System.out.println();
            }
        } else if(s < 0){
            for (double i = 0; i >=s - 0.1; i = i - 0.1 ){
                System.out.printf("%.1f",i);
                System.out.println();
            }
        }

    }
}
