public class AverageFinder {

    public static void main(String[] args) {

        System.out.println("Start...");
                // oblicz średnią
                double avg = findAverage (args);


        System.out.println("średnia to : " +avg);

            }
    private static double findAverage (String [] args) {
        double result = 0;

        for ( String s : args) {
            result += Integer.parseInt(s);
        }


        return result/ args.length;
    }
}
