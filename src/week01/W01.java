package week01;
import java.util.Arrays;
import java.util.Scanner;

public class W01 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");

        final float pie = 3.14f;
        System.out.println(pie);

        // 기본형 : 숫자 문자 boolean
        // 참조형 : String Object Array List

        boolean flag = true;
        flag = false;

        System.out.println("--------------flag--------------");
        System.out.println(flag);

        char alphabet = 'A';
        System.out.println("--------------alphabet--------------");
        System.out.println(alphabet);

        byte byteNumber = 127;          // -128 ~ 127
        short shortNumber = 32767;      // -32,768 ~ 32,767
        int intNumber = 2147483647;
        long longNumber = 123456789L;

        System.out.println("--------------정수--------------");

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 3.14f;
        double doubleNumber = 3.14;

        System.out.println("--------------실수--------------");

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        System.out.println("--------------문자열--------------");

        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        int[] a = {1,2,3};
        System.out.println(Arrays.toString(a));

        int number = 21;
        Integer num = number;     // boxing

        System.out.println(num.intValue());        // unboxing

        Scanner sc = new Scanner(System.in);

        int asciNumber = sc.nextInt();
        char ch = (char)asciNumber;

        System.out.println(ch);

        char letter = sc.nextLine().charAt(0);
        asciNumber = (int)letter;

        System.out.println(asciNumber);

        doubleNumber = 10.101010;
        floatNumber = 10.1010f;

        intNumber = (int)doubleNumber;
        System.out.println("double->int" + intNumber);

        intNumber = (int)floatNumber;
        System.out.println("float->int" + intNumber);

        intNumber = 10;
        doubleNumber = (double)intNumber;
        floatNumber = (float)intNumber;

        System.out.println("int->double" + doubleNumber);
        System.out.println("int->float" + floatNumber);

        byteNumber = 10;
        intNumber = byteNumber;
        System.out.println(intNumber);

        char charAlphabet = 'A';
        intNumber = charAlphabet;
        System.out.println(intNumber);

        intNumber = 100;
        longNumber = intNumber;
        System.out.println(longNumber);

        intNumber = 200;
        doubleNumber = intNumber;
        System.out.println(doubleNumber);

        // 연산은 큰타입으로 형변환

        intNumber = 10;
        doubleNumber = 5.5;
        System.out.println(intNumber + doubleNumber);

        int iResult = intNumber/4;
        double dResult = intNumber/4.0;

        System.out.println(iResult + "" + dResult);
    }
}
