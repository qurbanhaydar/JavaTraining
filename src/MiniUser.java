import java.util.Scanner;

public class MiniUser {
    public static void main(String[] args) {

        String user = "qurban";
        String pass = "12345";

        Scanner scanner = new Scanner(System.in);


        int girishsayi = 3;

        while (true) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals(user) && password.equals(pass)){
                System.out.println("Girish edildi...");
                break;
            }else if (!username.equals(user) && password.equals(pass)) {
                System.out.println("Username sehvdir..");
                girishsayi -=1;
                System.out.println("Girish haqqi: " + girishsayi);
            }else if (username.equals(user) && !password.equals(pass)){
                System.out.println("Parol sehvdir..");
                girishsayi -=1;
                System.out.println("Girish haqqi: " + girishsayi);
            }else {
                System.out.println("Username ve Parol sehvdir");
                girishsayi -=1;
                System.out.println("Girish haqqi: " + girishsayi);
            }
            if (girishsayi == 0) {
                System.out.println("Girish sayi bitdi. ");
                break;
            }

        }



    }
}
