public class AdditionalTask {

    public static void main(String[] args) {

        int a = 10;
        int b = 010;  // w systemie ósemkowym 0...
        int c = 0x10; // w systemie szesnatkowym 0x.....
        int d = a + b - c;

        System.out.println(a + "+" + b + "-" + c + "=" + d );
        System.out.println(d + "->" + Integer.toBinaryString(d));



    }

/*
    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        int c = 16;




        System.out.println(a);

        System.out.println(Integer.toOctalString(b));
        System.out.println(Integer.toHexString(c));

    int d = a + b - c;

        System.out.println(Integer.toBinaryString(d));
}*/
}

