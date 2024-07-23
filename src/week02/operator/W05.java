package week02.operator;

public class W05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int val = ++a + b--;

        System.out.println(val);
        System.out.println(b);
    }
}
