package co.btksoftware.shellsort;

public class ShellSort {

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

    private static void sort(int[] array) {
        int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }
}
