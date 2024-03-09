import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem: ");
        long a = scanner.nextInt();
        System.out.print("Ustu: ");
        long b = scanner.nextInt();
        long c = 1;
        for (int i=2; i<= b;i++){
            c *=a;
        }
        System.out.println("Netice " + c);
    }
}
