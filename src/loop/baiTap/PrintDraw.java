package loop.baiTap;

import java.util.Scanner;

public class PrintDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, choice2;
        int width, height;
        int triNumber;

        do {
            System.out.println("Menu");
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw triangle");
            System.out.println("0. Exit");
            System.out.println("Your select is ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Draw rectangle");
                    System.out.println("Input width of your figure: ");
                    width = scanner.nextInt();
                    System.out.println("Input height of your figure: ");
                    height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw rectangle");

                    System.out.println("1. Bottom-Left Triangle");
                    System.out.println("2. Top-Left Triangle");
                    System.out.println("3. Isosceles Triangle");
                    System.out.println("Choose your triangle: ");
                    choice2 = scanner.nextInt();
                    System.out.println("Choose the '*' number: ");
                    triNumber = scanner.nextInt();

                    switch (choice2) {
                        case 1:
                            for (int i = 0; i <= triNumber; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = 0; i <= triNumber; i++) {
                                for (int j = triNumber; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < triNumber; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = i; j < triNumber - i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Thank you and don't see you again");
                    break;
                default:
                    System.out.println("Wrong selection, chekc again");
            }
        } while (choice != 0);
    }
}
