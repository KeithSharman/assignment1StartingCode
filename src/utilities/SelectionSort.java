package utilities;

import java.util.Comparator;
import shapes.Shape;

public class SelectionSort {

    /**
     * Sorts an array of Shape objects in descending order using selection sort.
     * Uses Comparable (by height) if comparator is null.
     */
    public static void selectionSort(Shape[] array, Comparator<Shape> comparator) {
        if (array == null || array.length <= 1) return;

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the largest element in the unsorted portion
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                int cmp;
                if (comparator != null) {
                    cmp = comparator.compare(array[j], array[maxIdx]);
                } else {
                    cmp = array[j].compareTo(array[maxIdx]);
                }

                if (cmp > 0) { // if array[j] > array[maxIdx], update maxIdx
                    maxIdx = j;
                }
            }
            // Swap array[i] and array[maxIdx]
            Shape temp = array[i];
            array[i] = array[maxIdx];
            array[maxIdx] = temp;
        }
    }
}