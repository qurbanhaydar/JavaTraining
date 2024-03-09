import java.util.Scanner;

public class EbobEkob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem 1: ");
        int a = scanner.nextInt();
        System.out.print("Reqem 2: ");
        int b = scanner.nextInt();

        int ebob = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }

        int ekob = (a * b) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekob: " + ekob);
    }
}
