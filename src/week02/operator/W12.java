package week02.operator;

import java.util.Objects;
import java.util.Scanner;

public class W12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력");
        String aHand = sc.nextLine();

        System.out.println("입력");
        String bHand = sc.nextLine();

        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("비김");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("b");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("a");
            } else {
                System.out.println("b 이상");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("a");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("비김");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("b");
            } else {
                System.out.println("b 이상");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("b");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("a");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("비김");
            } else {
                System.out.println("b 이상");
            }
        } else {
            System.out.println("a 이상");
        }
    }
}
