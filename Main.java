import java.text.NumberFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principalValue = scanner.nextInt();
        System.out.print("Your Annual Interest Rate : " );
        float AIR = scanner.nextFloat();
        System.out.print("Term length in years: ");
        int period = scanner.nextInt();
        int periodInMonths = period * 12;
        float monthlyInterestRate = AIR / 100 / 12;
        double topMath = monthlyInterestRate *  Math.pow((1 + monthlyInterestRate), periodInMonths);
        double bottomMath =  Math.pow(( 1 + monthlyInterestRate ), periodInMonths) - 1;
        double mortgage = principalValue
                * topMath
                / bottomMath;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Monthly Mortgage is: " + mortgageFormatted);
    }
}