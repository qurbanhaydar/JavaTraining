public class Fibonocci {
    public static void main(String[] args) {
        int a = 50;
        long z = 0;
        long b = 1;
        if (a == 0) {
            System.out.println("0");
        } else if (a == 1) {
            System.out.println("1");
        } else {
            for (int i = 0; i <= a; i++) {
                System.out.println("Fibonocci " + i + ":" + z);
                long d = z;
                z = b;
                b = d + b;
            }
        }
    }
}
