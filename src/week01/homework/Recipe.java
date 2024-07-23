package week01.homework;
import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double star = Double.parseDouble(sc.nextLine());

        String[] explains = new String[10];

        for (int i = 0; i < 10; i++) {
            explains[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("[ " + name + " ]");
        System.out.println("별점 : " + star + " (" + star/5*100 + "%)");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + ". " + explains[i]);
        }
    }
}
