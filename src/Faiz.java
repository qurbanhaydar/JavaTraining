import java.util.Scanner;

public class Faiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("illik faiz hesablama.. (6%)");

        int pul,vaxt;
        System.out.print("Qoyulacag pul: ");
        pul = scanner.nextInt();
        System.out.print("Il: ");
        vaxt = scanner.nextInt();

        double axirincimebleg = pul;
        double faiz = 0.06;


        for (int i = 1; i<=10; i++) {
            axirincimebleg = (axirincimebleg * faiz) + axirincimebleg;
            System.out.println("Il sonunda netice: " + (int)axirincimebleg);
        }


    }
}
