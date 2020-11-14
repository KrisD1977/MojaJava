public class StringChecker {

    public static void main(String[] args) {

        String str1 = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst:" + str1);
        System.out.println("Długość tekstu:" + str1.length());
        System.out.println("Znak na pozycji 0:" + str1.charAt(0));
        System.out.println("Fragment od znaku 3 do znaku 10:" + str1.substring(3,10));
        System.out.println("Indeks pierwszej litery t:" + str1.indexOf('t'));
        System.out.println("Indeks początku podtektsu \"długi \":" + str1.indexOf("długi"));
        System.out.println("Tekst wielkimi literami:" + str1.toUpperCase());

    }
}
