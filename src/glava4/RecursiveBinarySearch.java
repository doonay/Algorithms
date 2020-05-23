package glava4;

//4.4 Определите базовый и рекурсивный случаи в алгоритме бинарного поиска.
public class RecursiveBinarySearch {
    private static int binarySearch(int[]sortedArr, int key, int low, int high) {
            int middle = (low + high)/2;

            if (key == sortedArr[middle]) { //базовый случай
                return middle;
            } else if (key < sortedArr[middle]) {
                return binarySearch(sortedArr, key, low, middle - 1);
            } else {
                return binarySearch(sortedArr, key, middle + 1, high);
            }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,7};
        int length = arr.length;
        System.out.println(binarySearch(arr, 4, 0, length)); //Массив передаем отсортированный!
    }
}
