import java.util.Scanner;

public class ConverterNum {

    public static void main(String[] args) {

        /*String bin = "1101";*/

        System.out.print("Wpisz liczbę w systemie dwójkowym, n =");

        Scanner scanner = new Scanner(System.in);

        String bin = scanner.next();

        Long result = 0L;

        // 1        1      0     1   //liczba binarnie
        //  0        1     2       3    // indeks (i)
        //  3        2     1       0 // potęgi 2 - odwrócony indeks
        // 1*2^3   1*2^2   0*2^1  1*2^0

       /* System.out.println(bin.length());
        System.out.println(bin.charAt(2));*/

        for (int i = 0; i < bin.length(); i++) {

            char c = bin.charAt(i); // /*System.out.println((int)c);*/ wartość dziesiętna 1 to 49 itp.
            int bit = Character.getNumericValue(i);
            int reverseIndex = bin.length() - i - 1;

            System.out.println(" i=" + i + " bit:" + bit + " potęga liczby 2: " + reverseIndex);

            result += bit * (long) Math.pow(2, reverseIndex);

        }

        System.out.println("Binarnie:" + bin + " to dziesiętnie:" + result);

    }
}
