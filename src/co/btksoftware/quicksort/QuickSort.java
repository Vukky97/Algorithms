package co.btksoftware.quicksort;

public class QuickSort {

    private static int[] random_array = new int[]{5, 3, 7, 1, 8, 9, 4, 2, 6};

    public static void main(String[] args) {
        System.out.println("Array before sorting: ");
        printArray(random_array);
        System.out.println("Array after sorting: ");
        sort(random_array, 0, random_array.length - 1);
        printArray(random_array);
    }

    private static void swap(int array[], int x, int y) {
        int helper = array[x];
        array[x] = array[y];
        array[y] = helper;
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        // index of smaller element
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // if current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void sort(int arr[], int low, int high) {
        if (low < high) {
            // n is the partitioning index
            int n = partition(arr, low, high);
            // recursively sort elements before partition
            sort(arr, low, n - 1);
            // recursively sort elements after partition
            sort(arr, n + 1, high);
        }
    }
}

