package week02.Operator;

public class W01 {
    public static void main(String[] args) {
        // 산술연산자 : + - * / % << >>
        // 비교연산자 > < >= <= == !=
        // 논리연산자 && || !
        // 대입연산자 = ++ --
        // 기타연산자


        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        int a = 20;
        int b = 10;

        int c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

    }
}
