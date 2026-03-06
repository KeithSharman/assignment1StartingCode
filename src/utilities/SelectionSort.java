package utilities;

import java.util.Comparator;
import shapes.Shape;

public class SelectionSort {

    public static void selectionSort(Shape[] array, Comparator<Shape> comparator) {
        if (array == null || array.length <= 1) return;

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            
            int bestIdx = i;

            for (int j = i + 1; j < n; j++) {

                int cmp;
                if (comparator != null) {
                    cmp = comparator.compare(array[j], array[bestIdx]);
                } else {
                    cmp = array[j].compareTo(array[bestIdx]);
                }

                
                if (cmp < 0) {
                    bestIdx = j;
                }
            }

            if (bestIdx != i) {
                Shape temp = array[i];
                array[i] = array[bestIdx];
                array[bestIdx] = temp;
            }
        }
    }

    // factory methods
    public static void sortByHeight(Shape[] array) {
        selectionSort(array, null);
    }

    public static void sortByArea(Shape[] array) {
        Comparator<Shape> byAreaDesc = (a, b) -> Double.compare(b.calcBaseArea(), a.calcBaseArea());
        selectionSort(array, byAreaDesc);
    }

    public static void sortByVolume(Shape[] array) {
        Comparator<Shape> byVolumeDesc = (a, b) -> Double.compare(b.calcVolume(), a.calcVolume());
        selectionSort(array, byVolumeDesc);
    }
}