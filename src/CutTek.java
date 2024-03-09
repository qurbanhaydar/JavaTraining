import java.util.Scanner;

public class CutTek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cut = 0;
        int tek = 0;
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i%2 == 0){
                cut++;
            }else {
                tek++;
            }
        }
        System.out.println("Tek " + cut);
        System.out.println("Cut " + tek);
        double percentage = a;
        System.out.println(tek / percentage * 100);
        System.out.println(cut / percentage * 100);
    }
}
