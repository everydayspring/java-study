package week02.array;

public class Arr07 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 1};

        int max = arr[0];

        for(int num: arr){
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }
}
