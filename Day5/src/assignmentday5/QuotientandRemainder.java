package assignmentday5;

import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Dividend ");
        int dividend=sc.nextInt();
        System.out.print("Enter Divisor ");
        int divisor=sc.nextInt();
        int Quotient=dividend/divisor;
        int remainder =dividend%divisor;
        System.out.println("Quotient: "+Quotient);
        System.out.println("Remainder: "+remainder);
    }
}
