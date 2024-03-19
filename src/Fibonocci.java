import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Reqemi yazin: ");
        int reqem = scanner.nextInt();

        long old = 0;
        long now = 1;
        if (reqem == 0) {
            System.out.println("0");
        } else if (reqem == 1) {
            System.out.println("1");
        } else {
            for (int i = 0; i <= reqem; i++) {
                System.out.println("Fibonocci " + i + ": " + old);
                long neww = old;//0  1  1
                old = now;//1   1    2
                now = neww + now;//1  2  3
            }
        }
    }
}
