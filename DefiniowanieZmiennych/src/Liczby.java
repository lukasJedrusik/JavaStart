

public class Liczby {
    public static void main(String[] args) {
        //int numberOfArguments = args.length;

        System.out.println("Ilosc argumentow:" + args.length);

        int j;
        int square;
        int suma = 0;

        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");}
        System.out.println();

        for (int i = 0; i < args.length; i++){
            j = Integer.parseInt(args[i]);
            square = j * j;
            System.out.print(square + " ");
        }

        System.out.println();

        for (int i = 0; i < args.length; i++){
            if(i < args.length - 1){
                System.out.print(args[i] + " + ");
            }
            else {
                System.out.print(args[i]);
            }
            suma = suma + Integer.parseInt(args[i]);
        }
        System.out.println(" = " + suma);
    }
}
