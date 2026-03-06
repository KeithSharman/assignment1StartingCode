package utilities;

import java.util.Comparator;
import shapes.Shape;

public class BubbleSort {


    public static void bubbleSort(Shape[] array, Comparator<Shape> comparator) {

        if (array == null || array.length <= 1) {
            return;
        }

        int n = array.length;
        
        
        
        // cycle through array
        for (int i = 0; i < n - 1; i++) {

        	
        	
            // compare two items beside each other
            for (int j = 0; j < n - i - 1; j++) {

                int cmp = 0;

                
                
                
                if (comparator != null) {
                    cmp = comparator.compare(array[j], array[j + 1]);
                } 
                else {
                    cmp = array[j].compareTo(array[j + 1]);
                }

                
                
                // keeps bigger value in front for descending order.
                if (cmp < 0) {

                    Shape temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}