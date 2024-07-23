package week02.operator;

public class W11 {
    public static void main(String[] args) {

        boolean flag = true;
        int num = 2;

        if (flag) {
            System.out.println("true");
            if(num == 1) {
                System.out.println(1);
            } else if (num == 2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        } else {
            if(num == 1) {
                System.out.println(1);
            } else if (num == 2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
