package utilities;

import java.util.Comparator;
import shapes.Shape;

public class MergeSort {

    public static void mergeSort(Shape[] array, Comparator<Shape> comparator) {
        if (array == null || array.length <= 1) return;
        mergeSort(array, 0, array.length - 1, comparator);
    }

    private static void mergeSort(Shape[] array, int left, int right, Comparator<Shape> comparator) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid, comparator);
        mergeSort(array, mid + 1, right, comparator);
        merge(array, left, mid, right, comparator);
    }

    private static void merge(Shape[] array, int left, int mid, int right, Comparator<Shape> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Shape[] L = new Shape[n1];
        Shape[] R = new Shape[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            int cmp;
            if (comparator != null) {
                cmp = comparator.compare(L[i], R[j]);
            } else {
                cmp = L[i].compareTo(R[j]);
            }

            if (cmp >= 0) { 
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}