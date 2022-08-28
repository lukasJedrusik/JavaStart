//Napisz program, który w przypadku liczb podzielnych przez 3 wyświetli liczbę i słowo "Fizz",
// podzielnych przez 5 wyświetli liczbę i słowo "Buzz", a podzielnych zarówno przez 3 i 5 wyświetli liczbę i słowo "FizzBuzz".
// Pozostałe liczby nie powinny być wyświetlane. Zakładamy, że pracujemy na liczbach z przedziału <1; 100>.


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if(i % 15 == 0 ){
                System.out.println( i + " FizzBuzz");
            } else if( i % 5 == 0){
                System.out.println(i + " Buzz");
            } else if(i % 3 == 0){
                System.out.println(i + " Fizz");
            }
        }
    }
}
