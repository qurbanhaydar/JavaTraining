public class HomeWork2 {
    public static void main(String[] args) {
        String a = "HHHTTHTHTTHTHHTHTHTHHT";
        double sumH = 0;
        double sumT = 0;

        for (int i = 0; i< a.length();i++){

            if (a.charAt(i) == 'H'){
                sumH++;
            }
            else {
                sumT++;
            }

        }
        double length = a.length();
        System.out.println(sumH / length * 100);
        System.out.println(sumT / length * 100);
        System.out.println(sumH);
        System.out.println(sumT);
    }
}
