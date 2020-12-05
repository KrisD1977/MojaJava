public class DayCounterTwo {

    public static void main(String[] args) {

        int monthIn = 13;
        int yearIn = 2021;

        if (monthIn < 1 | monthIn > 12) {
            System.out.println( " zły miesiąc");
        } else {

        if ((monthIn % 2 == 0) && (monthIn < 7) && (monthIn > 2)) {
            System.out.println("miesiąc: " + monthIn + " ma  30 dni");
        } else if (monthIn % 2 == 1 && monthIn > 7) {
            System.out.println("miesiąc: " + monthIn + " ma  30 dni");
        } else if (monthIn == 2) {

            if (yearIn % 4 == 0) {
                System.out.println("miesiąc: " + monthIn + " ma  29 dni");
            } else {
                System.out.println("miesiąc: " + monthIn + " ma  28 dni");
            }

        } else {
            System.out.println("miesiąc: " + monthIn + " ma  31 dni");
        }
    }}
}
