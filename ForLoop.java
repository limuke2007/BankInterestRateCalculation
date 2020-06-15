package java_masterclass;

public class ForLoop {
    public static void main(String[] args) {

        for (double i = 2; i < 9; i = i + 0.5 ) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f" ,calculatedInterest(10000.0, i)) );
        }
    }
    private static double calculatedInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}
