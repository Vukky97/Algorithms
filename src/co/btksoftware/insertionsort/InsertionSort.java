package co.btksoftware.insertionsort;

public class InsertionSort {

    private static int[] random_array = new int[]{5, 3, 7, 1, 8, 9, 4, 2, 6};

    public static void main(String[] args) {
        System.out.println("Array before sorting:");
        printArray(random_array);
        System.out.println("Array after sorting:");
        sort(random_array);
        printArray(random_array);
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // key is the current limit
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
