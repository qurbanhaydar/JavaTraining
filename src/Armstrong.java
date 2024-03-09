
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem: ");
        int reqem = scanner.nextInt();
        System.out.print("Reqem sayi: ");
        int reqemsayi = scanner.nextInt();
        int reqem1 = reqem;
        int toplam = 0;

        do {
            int qaliq = reqem1 % 10;
            reqem1 /=10;
            toplam += Math.pow(qaliq,reqemsayi);




        }while (reqem1 >0);
            if (reqem == toplam){
                System.out.println("Armstrong");
            }else {
                System.out.println("NonArmstrong");
            }



    }

}