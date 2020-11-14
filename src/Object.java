public class Object {

    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        FamilyMember mom = new FamilyMember();
        FamilyMember son = new FamilyMember();


        System.out.println("Nazwisko rodowe to :" + FamilyMember.lastName);
        System.out.println("Nazwisko rodowe to :" + dad.lastName);// niepoprawnie, bo to statyczna zmienna klasowa

        System.out.println("Nazwisko mom rodowe to :" + FamilyMember.lastName);

        dad.lastName = "Nowak";

        System.out.println("Nazwisko son rodowe to :" + FamilyMember.lastName);



    }
}
