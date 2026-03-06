package utilities;

import java.util.Comparator;
import shapes.Shape;

public class BubbleSort {

    public static void bubbleSort(Shape[] array, Comparator<Shape> comparator) {
        if (array == null || array.length <= 1) return;

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                int cmp;
                if (comparator != null) {
                    cmp = comparator.compare(array[j + 1], array[j]);
                } else {
                    cmp = array[j].compareTo(array[j + 1]);
                }
                if (cmp < 0) {
                    Shape temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}