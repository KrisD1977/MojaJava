import java.util.StringTokenizer;

public class TokenTester {

    public static void main(String[] args) {

        StringTokenizer str1, str2;

        String quote = " Google 900  -9.95";
        str1 = new StringTokenizer(quote);

        System.out.println("Token1: " + str1.nextToken());
        System.out.println("Token2: " + str1.nextToken());
        System.out.println("Token3: " + str1.nextToken());

        String quote2 = "RHT@75@-0.22";

        str2 = new StringTokenizer(quote2,"@");
        System.out.println("Token1: " + str2.nextToken());
        System.out.println("Token2: " + str2.nextToken());
        System.out.println("Token3: " + str2.nextToken());




    }
}
