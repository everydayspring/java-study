package week02.operator;

public class W15 {
    public static void main(String[] args) {

        int num = 0;

        while (num < 10) {
            System.out.println(num);
            num++;
        }

        num = 4;
        do {
            System.out.println(num);
        } while (num < 3);

        num = 0;
        while (num < 3) {
            num++;
            if (num == 2) {
                break;
            }
            System.out.println(num);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i" + i);
            if (i == 2) {
                break;
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j" + j);
                if (j == 2) {
                    break;
                }
            }
        }

        num = 0;
        while (num < 3) {
            num ++;
            if (num == 2) {
                continue;
            }
            System.out.println(num);
        }
    }
}
