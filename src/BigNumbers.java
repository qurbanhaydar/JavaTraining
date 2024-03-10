import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Büyük sayı 1: ");
        String buyukSayi1 = scanner.next();

        System.out.print("Büyük sayı 2: ");
        String buyukSayi2 = scanner.next();

        String toplam = topla(buyukSayi1, buyukSayi2);

        System.out.println("Toplam: " + toplam);
    }

    public static String topla(String sayi1, String sayi2) {
        StringBuilder sonuc = new StringBuilder();
        int taşıma = 0;

        int uzunluk1 = sayi1.length() - 1;
        int uzunluk2 = sayi2.length() - 1;

        while (uzunluk1 >= 0 || uzunluk2 >= 0 || taşıma > 0) {
            int rakam1 = (uzunluk1 >= 0) ? sayi1.charAt(uzunluk1) - '0' : 0;
            int rakam2 = (uzunluk2 >= 0) ? sayi2.charAt(uzunluk2) - '0' : 0;

            int toplam = rakam1 + rakam2 + taşıma;
            taşıma = toplam / 10;
            int kalan = toplam % 10;

            sonuc.insert(0, kalan);

            uzunluk1--;
            uzunluk2--;
        }

        return sonuc.toString();
    }
}
