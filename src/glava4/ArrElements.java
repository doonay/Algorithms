package glava4;

import java.util.Arrays;
//4.2 Напишите рекурсивную функцию для подсчета элементов в списке
public class ArrElements {
    private static int elements(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        return 1 + elements(Arrays.copyOfRange(arr, 1, arr.length)); //1 + всё, что осталось в массиве
    }

        public static void main(String[] args) {
            int[] arr = new int[]{10, 20, 30, 40};
            System.out.println(elements(arr));
    }
}
