public class DivideChecker {

    int a;

    void checker() {

        boolean divider = (a % 5 == 0) & (a % 7 == 0);
        System.out.println(divider);
    }


    public static void main(String[] args) {


        DivideChecker test = new DivideChecker();
        test.a = 70;

        test.checker();

    }
}
