package utilities;

import shapes.Shape;
import shapes.ShapeComparator;

import java.util.Comparator;
/**
 * File: MergeSort
 * Author: Keith Sharman
 * Date: 2026-03-06
 * Description: contains the MergeSort class, separated into two classes
 */

public class MergeSort {
	/**
	 *Sorts using a merge sort algorithm in descending order
	 *Comes with factory methods to make it easy i.e 
	 *MergeSort.sortByHeight(shapes);
	 *can also be created and accepts a comparator type as an argument
	 */
	
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
	    if (comp == null) {
	        comp = (a, b) -> a.compareTo(b);
	    }
	    
	    //stop if array too short to divide
	    if (arr.length <= 1) return;
	    
	    //divide into pieces
	    int mid = arr.length / 2;

        Shape[] left = new Shape[mid];
        Shape[] right = new Shape[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        //sort arrays
        sort(left, comp);
        sort(right, comp);
        
        //merge back together
        merge(arr, left, right, comp);
    }
    
    //code for merging back 
    private static void merge(Shape[] result, Shape[] left, Shape[] right, Comparator<Shape> comp) {
    	/**
    	 * Handles the logic for merging the arrays back together, 
    	 * sorting them in descending order
    	 */
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
        	
        	//place in descending order
            if (comp.compare(right[j], left[i]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        //repeat
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}