import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int reversed = 0;
        for (; a != 0; reversed = reversed * 10 + a % 10, a/=10 ) ;
        System.out.println("Tersi: " + reversed);
        scanner.close();
    }
}

