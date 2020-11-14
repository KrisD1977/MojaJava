public class InfoWorkers {

    String firstName;
    String lastName;
    short age;
    char gender;
    int personalID;

    void showInfo () {
        System.out.println("Imię: " +firstName);
        System.out.println("Nazwisko: " +lastName);
        System.out.println("Wiek: " +age);
        System.out.println("Płeć: " +gender);
        System.out.println("Numer Id: " +personalID);
    }

    public static void main(String[] args) {

        InfoWorkers danKowalski = new InfoWorkers();

        danKowalski.firstName = "Daniel";
        danKowalski.lastName = "Kowalski";
        danKowalski.age = 43;
        danKowalski.gender = 'm';
        danKowalski.personalID = 12345678;

        danKowalski.showInfo();

    }


}
