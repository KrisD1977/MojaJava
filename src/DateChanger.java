import java.util.StringTokenizer;

public class DateChanger {

    public static void main(String[] args) {

        StringTokenizer str1;

        String date = "14/11/2020";


        str1 = new StringTokenizer(date, "/");
        System.out.println("Dzień: " + str1.nextToken());
        System.out.println("Miesiąc: " + str1.nextToken());
        System.out.println("Rok: " + str1.nextToken());
    }
}
