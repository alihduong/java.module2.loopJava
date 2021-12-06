package loop.thucHanh;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("Number " + num + " not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println("Number "+num+ " is a prime");
            }else {
                System.out.println("Number "+num+ " is a not prime");
            }
        }
    }
}
