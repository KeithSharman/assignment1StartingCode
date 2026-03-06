package utilities;

import java.util.Comparator;
import shapes.Shape;

public class Selection {

    public static void selectionSort(Shape[] array, Comparator<Shape> comparator) {
        if (array == null || array.length <= 1) return;

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                int cmp;
                if (comparator != null) {
                    cmp = comparator.compare(array[j], array[maxIdx]);
                } else {
                    cmp = array[j].compareTo(array[maxIdx]);
                }

                if (cmp > 0) { 
                    maxIdx = j;
                }
            }

            Shape temp = array[i];
            array[i] = array[maxIdx];
            array[maxIdx] = temp;
        }
    }
}