package week02.operator;

public class W06 {
    public static void main(String[] args) {

        int intNum = 93 + (int) 98.8;
        System.out.println(intNum);

        double doubleNum = (double) 93 + 9.88;
        System.out.println(doubleNum);

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);


    }
}
