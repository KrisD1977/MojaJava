import java.util.Scanner;

public class MatrixVer2 {

    public static void main(String[] args) {
        System.out.print(" n = " );
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print( "matrix" );

        System.out.println("\n --------------------------------- ");



        if (number > 30) {
            System.out.println(" Za duża liczba");

        } else if (number < 0) {
            System.out.println(" Za mała liczba");

        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 0; j < number ; j++) {
                    System.out.printf("%3s", (j+i)  +" ");

                }
                System.out.println(" ");

            }


        }

    }
}
