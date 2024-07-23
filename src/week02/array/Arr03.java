package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = a;

        // b[0] = 3;

        System.out.println(a[0]);

        // 이차원 배열에서 얕은 복사
        // b = a.clone();

        b = Arrays.copyOf(a, a.length);

        b[0] = 3;

        System.out.println(a[0]);
    }
}
