public class NumInString {
    public static void main(String[] args) {
        String a = "231ijjd123msdaidmao232m23";
        int num = 0;
        int str = 0;
        String b = "dsadasdadda";
        for (int i = 0; i<a.length();i++){
            if (Character.isDigit(a.charAt(i))) {
                num += Character.getNumericValue(a.charAt(i));


            }
        }
        System.out.println(num);
    }
}
