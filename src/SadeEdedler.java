import java.util.Scanner;

public class SadeEdedler {
    public static boolean sade (int a) {
        for (int i = 2; i<a; i++ ) {
            if (a%i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        for (int i = 2; i <= b; i++) {
            if (sade(i)){
                System.out.println("Sade: " + i);
            }
        }
    }
}
