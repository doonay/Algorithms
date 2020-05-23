package glava4;

import java.util.Arrays;
//4.3 Найдите наибольшее число в списке
public class MaxElement {
    private static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        System.out.println(max(arr));
    }
}
