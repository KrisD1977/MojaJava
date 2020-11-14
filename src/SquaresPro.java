public class SquaresPro {

    int a;
    int b;
    int o;
    double p;

    public void showNumbers() {
        b = a * a;
        o = 4 * a;
        p = a * Math.sqrt(2);

        System.out.println("Kwadrat o boku: " + a + ",ma pole: " + b + ", obwód: " + o + ", przekatną: " + p);
    }

    public static void main(String[] args) {

        SquaresPro kwadrat1 = new SquaresPro();
        kwadrat1.a = 2;
        kwadrat1.showNumbers();


        SquaresPro kwadrat2 = new SquaresPro();
        kwadrat2.a = 7;
        kwadrat2.showNumbers();


        SquaresPro kwadrat3 = new SquaresPro();
        kwadrat3.a = 11;
        kwadrat3.showNumbers();

        SquaresPro kwadrat4 = new SquaresPro();
        kwadrat3.a = 19;
        kwadrat3.showNumbers();


    }
}
