import java.util.Scanner;

public class MiniAtm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balans = 1000;

        String functions = "1. Balans Yoxlama\n"
                + "2. Pul Qoymaq\n"
                + "3. Pul Cekmek\n"
                + "4. Cixis";



        while (true){
            System.out.println(functions);
            System.out.print("Funksiya secin: ");
            int func = scanner.nextInt();

            if (func == 1) {
                System.out.println(balans);
            } else if (func == 2) {
                System.out.print("Meblegi yazin: ");
                int deposit = scanner.nextInt();
                balans+=deposit;
                System.out.println("Yeni mebleg:" + balans);
            }else if (func == 3) {
                System.out.print("Meblegi yazin: ");
                int withdraw = scanner.nextInt();
                if (balans > withdraw){
                    balans -= withdraw;
                    System.out.println("Yeni mebleg:" + balans);
                } else {
                    System.out.println("Duzgun mebleg yazmalisiz..");
                }

            } else if (func == 4) {
                System.out.println("Sistemden chixilir.....");
                break;

            }else {
                System.out.println("Bele funksiya movcud deyil..");
            }
        }
    }
}
