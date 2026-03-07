package utilities;

import java.util.Comparator;
import shapes.Shape;

public class SelectionSort {
	/**
	 * File: SelectionSort.java
	 * Author: Keith Sharman
	 * Date: 2026-03-06
	 * Description: contains the SelectionSort class
	 */
	
    public static void selectionSort(Shape[] array, Comparator<Shape> comparator) {
       
    	
    	if (array == null || array.length <= 1) return;

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

        	// Assume the current position holds
            // the minimum element
            int bestIdx = i;
            
            //// Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
            	
            	//logic for comparison type
                int cmp;
                if (comparator != null) {
                    cmp = comparator.compare(array[j], array[bestIdx]);
                } else {
                	cmp = array[bestIdx].compareTo(array[j]);
                }

             // Update min_idx if a smaller element
                // is found
                if (cmp < 0) {
                    bestIdx = j;
                }
            }
            
             // Move minimum element to its
            // correct position
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