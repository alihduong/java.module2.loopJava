package loop.thucHanh;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("4. Exit");
        System.out.println("-----Please select function in Menu-----");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw The Triangle");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
                break;
            case 2:
                System.out.println("Draw The Square");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 3:
                System.out.println("Draw The Rectangle");
                System.out.println("*************");
                System.out.println("*************");
                System.out.println("*************");
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("No choice!!!");
        }
    }
}
