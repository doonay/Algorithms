package glava4;

import java.util.Arrays;

public class RecursiveSum {
    static int count = 0;
    static int length;

    private static int sum(int[] arr) {
        if (arr.length == 0) {
            System.out.println("!Случился базовый случай. Длина массива равна " + arr.length + ". ");
            for (int i = length; i > 0; i--) {
                System.out.println("Незавершенный рекурсивный метод №" + count + " завершился и просуммировался с результатом предыдущего метода");
                count--;
            }

            return 0;
        } else {
            count++;
            System.out.print("Рекурсивный случай N" + count + ": ");
            System.out.print(arr[0] + " + [ ");
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("] = В стеке висит незавершенный рекурсивный метод №" + count + " и ждет возврата следующего рекурсивного метода.");
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length)); // МАГИЯ ТУТ! оператор "+" суммирует все результаты рекурсивных методов.
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{345, 246, 24, 394};
        length = arr.length;
        System.out.println("Сумма всех эллементов массива = " + sum(arr));
    }
}
