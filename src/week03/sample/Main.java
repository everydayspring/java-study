package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getNum());
        System.out.println(main.getNum());
    }

    public int getNum() {
        int num = 1;
        num += 1;
        return num;
    }
}
