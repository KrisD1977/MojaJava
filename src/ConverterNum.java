public class ConverterNum {

    public static void main(String[] args) {

        String bin = "1101";
        Long result = 0L;

         // 1        1      0     1   //liczba binarna
        //  0        1     2       3    // indeks (i)
        //  3        2     1       0 // potęgi 2 - odwrócony indeks
        // 1*2^3   1*2^2   0*2^1  1*2^0

        for (int i = 0; i < bin.length(); i++) {

            char c = bin.charAt(i);
            int bit = Character.getNumericValue(c);
            int reverseIndex = bin.length() - i -1;

            System.out.println("i=" +i + " bit:" + bit + " ri: " + reverseIndex);

            result += bit * (long)Math.pow(2, reverseIndex);

            System.out.println("Bin:" + bin + " to dziesiętnie:" + result);
        }


    }
}
