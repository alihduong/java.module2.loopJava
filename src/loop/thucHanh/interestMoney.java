package loop.thucHanh;

import java.util.Scanner;

public class interestMoney {
    public static void main(String[] args) {
        double money, interest;
        int month;
        double totalInterest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Money: ");
        money = scanner.nextDouble();
        System.out.print("Enter interest: ");
        interest = scanner.nextDouble();
        System.out.print("Enter loan month: ");
        month = scanner.nextInt();
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
