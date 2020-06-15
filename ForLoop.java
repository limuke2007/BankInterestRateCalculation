package java_masterclass;

public class ForLoop {
    public static void main(String[] args) {

        for (double i = 2; i < 9; i += 0.5 ) {
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f" ,calculatedInterest(10000.0, i)) );
        }
    }
    private static double calculatedInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}

/* printed output: 

10,000 at 2.0% interest = 200.00
10,000 at 2.5% interest = 250.00
10,000 at 3.0% interest = 300.00
10,000 at 3.5% interest = 350.00
10,000 at 4.0% interest = 400.00
10,000 at 4.5% interest = 450.00
10,000 at 5.0% interest = 500.00
10,000 at 5.5% interest = 550.00
10,000 at 6.0% interest = 600.00
10,000 at 6.5% interest = 650.00
10,000 at 7.0% interest = 700.00
10,000 at 7.5% interest = 750.00
10,000 at 8.0% interest = 800.00
10,000 at 8.5% interest = 850.00
