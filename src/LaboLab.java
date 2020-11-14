import java.util.Scanner;

public class LaboLab {

    public static void main(String[] args) {

        System.out.print("n =");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n > 30) {
            System.out.println("To za dużo, wybierz liczbę od 1 do 30.");

        } else {

            System.out.println(" n= " + n + " matrix");
            System.out.println("-------------------");

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n  ; j++) {


                    System.out.printf("%3s", + i +j + " ");

                }
                System.out.println();


            }
        }
    }
}

