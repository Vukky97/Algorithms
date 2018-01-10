package co.btksoftware.binarysearch;

import java.util.Random;

public class BinarySearch {

    private static int[] random_array = new int[]{1, 12, 23, 34, 45, 56, 67, 78, 89};

    public static void main(String[] args) {
        System.out.println("Searching in the following array:");
        printArray(random_array);
        Random random = new Random();
        int random_number = random_array[random.nextInt(random_array.length - 1)];
        System.out.printf("Searching for number %d:\n", random_number);
        int result = recursiveSearch(random_array, 0, random_array.length - 1, random_number);
        if (result != -1) {
            System.out.printf("The element is present at index %d!\n", result);
        } else {
            System.out.println("The element is not present in the array!");
        }
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static int iterativeSearch(int array[], int element) {
        int left_index = 0;
        int right_index = array.length - 1;

        while (left_index <= right_index) {

            int middle = left_index + (right_index - left_index) / 2;

            if (array[middle] == element) {
                // element is present, returning the index
                return middle;
            }

            if (array[middle] < element) {
                // if the element is greater than middle element, ignore left half
                left_index = middle + 1;
            } else {
                // if the element is smaller, ignore right half
                right_index = middle - 1;
            }
        }
        // the element was not present
        return -1;
    }

    private static int recursiveSearch(int array[], int left, int right, int element) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (array[middle] == element) {
                // the element is present, returning the index
                return middle;
            }

            if (array[middle] > element) {
                // if the element is smaller than the middle element, ignore right half
                return recursiveSearch(array, left, middle - 1, element);
            } else {
                // in this case the element is in the right half, ignore left half
                return recursiveSearch(array, middle + 1, right, element);
            }
        }
        // the element was not present
        return -1;
    }
}
