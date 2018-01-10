package co.btksoftware.bubblesort;

public class BubbleSort {

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

    private static void swap(int[] array, int x, int y) {
        int helper = array[x];
        array[x] = array[y];
        array[y] = helper;
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    // if the previous element is greater -> swap
                    swap(array, j - 1, j);
                }
            }
        }
    }
}
