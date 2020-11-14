public class NewInvestment {

    public static void main(String[] args) {

        float money = 14_001;

        System.out.println(" Kwota początkowa:\t"    +money) ;

        money = money + 0.4F * money;

        System.out.println(" Inwestycja po roku: \t" +money);

        money = money- 1500;

        System.out.println(" po 2 latach:\t" + money);

        money = money + 0.12F * money;

        System.out.println(" Po 3 latach: \t" + money);

    }
}
