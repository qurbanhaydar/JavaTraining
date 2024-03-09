
public class ReversedNumsInMethods {

        public static void revers (int a) {

            int reversed = 0;
            for (; a != 0; reversed = reversed * 10 + a % 10, a/=10 ) ;
            System.out.println("Tersi: " + reversed);





        }

        public static void main(String[] args) {
            revers(562);

        }

}
