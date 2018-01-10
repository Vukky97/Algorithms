package co.btksoftware.mergesort;

public class MergeSort {

    private static int[] random_array = new int[]{5, 3, 7, 1, 8, 9, 4, 2, 6};
    private static int[] temporary_array = new int[random_array.length];

    public static void main(String[] args) {
        System.out.println("Array before sorting:");
        printArray(random_array);
        System.out.println("Array after sorting:");
        recursiveSort(0, random_array.length - 1);
        printArray(random_array);
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void recursiveSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // below step sorts the left side of the array
            recursiveSort(lowerIndex, middle);
            // below step sorts the right side of the array
            recursiveSort(middle + 1, higherIndex);
            // merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
        // copy array to temporary array
        System.arraycopy(random_array, lowerIndex, temporary_array, lowerIndex, higherIndex + 1 - lowerIndex);

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (temporary_array[i] <= temporary_array[j]) {
                random_array[k] = temporary_array[i];
                i++;
            } else {
                random_array[k] = temporary_array[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            random_array[k] = temporary_array[i];
            k++;
            i++;
        }
    }
}
