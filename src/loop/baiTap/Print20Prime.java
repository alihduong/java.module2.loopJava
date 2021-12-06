package loop.baiTap;

public class Print20Prime {
    public static void main(String[] args) {
        int count, countPrime = 0;

        for (int i = 2; i > 0; i++) {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                countPrime++;
                System.out.print(i + " ");
            }
            if (countPrime == 20){
                break;
            }
        }
    }
}
