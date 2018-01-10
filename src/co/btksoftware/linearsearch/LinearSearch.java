package co.btksoftware.linearsearch;

import java.util.Arrays;

public class LinearSearch {

    private static int[] random_array = new int[]{5, 3, 7, 1, 8, 9, 4, 2, 6};

    public static void main(String[] args) {
        System.out.println("Linear searching in " + Arrays.toString(random_array));
        int result = search(random_array, 2);
        if (result != -1) {
            System.out.println("We have found the item at index: " + result);
        } else {
            System.out.println("We have not found the item!");
        }
    }

    private static int search(int array[], int x) {
        for (int i = 0; i < random_array.length; i++) {
            if (array[i] == x) {
                // return index if the element is found
                return i;
            }
        }
        // return -1 if the element is not found
        return -1;
    }
}
