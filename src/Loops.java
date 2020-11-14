public class Loops {

    public static void main(String[] args) {

        /*if (args.length < 3 ) {
            System.out.println("Za mało argumentów ...");
            System.exit(-1);
        }*/


        /*int a = -2;
        if (a > 1) {
            System.out.println("Jest większe");
        } else if (a == 0) {
            System.out.println("Jest równe zero");
        }
        else {
            System.out.println("Jest mniejsze.");
        }*/


        /*char grade = 'F';

        switch (grade) {
            case 'A' :
                System.out.println("Wspaniale");
                break;  ////////// bez breaka się wykona ta część pętli i tak
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;

            default :
                System.out.println("Rozważ oszukiwanie");

        }*/

        /*char grade = 'A';

        if (grade == 'A') {
            System.out.println("Wspaniale");
        } else if (grade == 'B') {
            System.out.println("Dobrze");

        }*/

        for (int i=1; i < 20; i++ ) {
            if (i % 2 ==0) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");

        }

      /*  int counter = 1;

        for (int i=1; i < 20; i++ ) {
            for (int j=1; j < 3; j++ ) {

                System.out.println("i = " + i + " j: " +j);
                counter ++;

            }
        }

        System.out.println("countert: " + counter);
*/



    }
}