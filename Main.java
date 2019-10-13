import java.text.NumberFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int principalValue = 0;
        float AIR = 0;
        int termLengthInYears;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Principal (1k - 1M): ");
            principalValue = scanner.nextInt();
            if(principalValue >= 1000 && principalValue <= 100_000_000)
                break;
            System.out.println("Enter a Value between 1000 and 100,000,000");

        }
        while (true){
            System.out.print("Your Annual Interest Rate : " );
            AIR = scanner.nextFloat();
            if(AIR > 0 && AIR < 25)
                break;
            System.out.println("Enter a value greater than 0 and less than 25");
        }
        while (true){
            System.out.print("Term length in years: ");
            termLengthInYears = scanner.nextInt();
            if(termLengthInYears >= 1 && termLengthInYears <= 30 )
                break;
            System.out.println("Enter a term length between 0 and 30 years");
        }

        int termLengthInMonths = termLengthInYears * 12;
        float monthlyInterestRate = AIR / 100 / 12;
        double topMath = monthlyInterestRate *  Math.pow((1 + monthlyInterestRate), termLengthInMonths);
        double bottomMath =  Math.pow(( 1 + monthlyInterestRate ), termLengthInMonths) - 1;
        double mortgage = principalValue
                * topMath
                / bottomMath;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Monthly Mortgage is: " + mortgageFormatted);
    }
}
