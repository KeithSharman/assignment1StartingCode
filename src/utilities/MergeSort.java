package utilities;

import shapes.Shape;
import shapes.ShapeComparator;

import java.util.Comparator;

/**
 *Comes with factory methods to make it easy i.e 
 *MergeSort.sortByHeight(shapes);
 */
public class MergeSort {
	
	//factory methods
	public static void sortByHeight(Shape[] arr) {
        sort(arr, (a, b) -> a.compareTo(b));
    }

	public static void sortByArea(Shape[] arr) {
	    sort(arr, ShapeComparator.byArea());
	}

	public static void sortByVolume(Shape[] arr) {
	    sort(arr, ShapeComparator.byVolume());
	}
    
    //sorting
    public static void sort(Shape[] arr, Comparator<Shape> comp) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;

        Shape[] left = new Shape[mid];
        Shape[] right = new Shape[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        sort(left, comp);
        sort(right, comp);

        merge(arr, left, right, comp);
    }
    
    //merging
    private static void merge(Shape[] result, Shape[] left, Shape[] right, Comparator<Shape> comp) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (comp.compare(left[i], right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}