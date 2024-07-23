package week02.array;

public class Arr04 {
    public static void main(String[] args) {

        String str = "ABCD";

        int strLength = str.length();
        System.out.println(strLength);

        char strChar = str.charAt(1);
        System.out.println(strChar);

        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        String newStr = "ABCD";
        boolean strEquals = newStr.equals(str);
        System.out.println(strEquals);

        char[] strChars = str.toCharArray();

        char[] charArr = {'A', 'B', 'C'};
        String charStr = new String(charArr);
        System.out.println(charStr);
    }
}
