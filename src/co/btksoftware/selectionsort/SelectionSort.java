package co.btksoftware.selectionsort;

public class SelectionSort {

    private static int[] random_array = new int[]{5, 3, 7, 1, 8, 9, 4, 2, 6};

    public static void main(String[] args) {
        System.out.println("Array before sorting: ");
        printArray(random_array);
        System.out.println("Array after sorting: ");
        sort(random_array);
        printArray(random_array);
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void sort(int array[]) {
        // iterating through the array length - 1
        for (int i = 0; i < array.length - 1; i++) {
            // assuming that the first element is the minimum
            int min_element = i;
            // comparing the next element with the "minimum"
            for (int j = i + 1; j < array.length; j++) {
                // if the next element is smaller than the previous, we set the new min_element
                if (array[j] < array[min_element]) {
                    min_element = j;
                }
            }
            // swap elements
            swap(array, min_element, i);
        }
    }

    private static void swap(int array[], int x, int y) {
        int helper = array[x];
        array[x] = array[y];
        array[y] = helper;
    }
}
