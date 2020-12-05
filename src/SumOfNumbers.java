import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 1 ) {
                break;
            }

            System.out.print( + i + " ");

        }


        System.out.println(" ");
        System.out.print("Liczba to:"  );

         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();


        int sum = 0;

        System.out.print("suma ");

        for (int i = 0; i <= n; i++) {

            sum = sum + i ;

            System.out.print(+ i + "+ ");

        }
        System.out.println(" = " + sum);

    }





}
