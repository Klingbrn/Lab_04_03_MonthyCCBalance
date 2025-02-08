public class balance {
    public static void main(String[] args) {

        int cardBalance = 5000;
        double INTEREST_RATE = 0.17;
        double firstMonth;
        double secondMonth;

        firstMonth = (cardBalance * INTEREST_RATE) + cardBalance;
        secondMonth = (firstMonth * INTEREST_RATE) + firstMonth;

        System.out.println("your first month balance is: " + firstMonth);
        System.out.println("you second month balance is: " + secondMonth);

        }
    }