import java.util.Scanner;

public class NumbConvMyVer {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        System.out.println("\n ---------------------------");

        Long result = 0L;

        int index = number.length();

        for (int i = 0; i < index; i++) {

            char c = number.charAt(i);
            int bit = Character.getNumericValue(c);

            result = bit * (int)Math.pow(2, index - i-1) + result;

        }

        System.out.println(" Binarniie: " + number + " to decymalnie: " + result);

    }
}
