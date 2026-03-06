package utilities;

import java.util.Comparator;
import shapes.Shape;

public class QuickSort {

    public static void quickSort(Shape[] array, Comparator<Shape> comparator)
    {
        if(array == null || array.length <= 1)
        {
            return;
        }

        quickSort(array, 0, array.length - 1, comparator);
    }

    // split the array and sort each side
    private static void quickSort(Shape[] array, int left, int right, Comparator<Shape> comparator)
    {
        if(left >= right)
        {
            return;
        }

        int pivotIndex = medianOfThree(array, left, right, comparator);
        Shape pivot = array[pivotIndex];

        // move pivot to end
        Shape temp = array[pivotIndex];
        array[pivotIndex] = array[right];
        array[right] = temp;

        int i = left;

        for(int j = left; j < right; j++)
        {
            int cmp;

            if(comparator != null)
            {
                cmp = comparator.compare(array[j], pivot);
            }
            else
            {
                cmp = array[j].compareTo(pivot);
            }

            // bigger shapes go  left
            if(cmp > 0)
            	
            {
                Shape t = array[i];
                array[i] = array[j];
                array[j] = t;

                i++;
            }
        }

        Shape t = array[i];
        array[i] = array[right];
        array[right] = t;

        quickSort(array, left, i - 1, comparator);
        quickSort(array, i + 1, right, comparator);
    }

    
    
    // choose pivot from left, middle, right
    private static int medianOfThree(Shape[] array, int left, int right, Comparator<Shape> comparator)
    {
        int mid = (left + right) / 2;

        int cmp1;
        int cmp2;
        int cmp3;

        if(comparator != null)
        {
            cmp1 = comparator.compare(array[left], array[mid]);
            cmp2 = comparator.compare(array[left], array[right]);
            cmp3 = comparator.compare(array[mid], array[right]);
        }
        else
        {
            cmp1 = array[left].compareTo(array[mid]);
            cmp2 = array[left].compareTo(array[right]);
            cmp3 = array[mid].compareTo(array[right]);
        }

        if(cmp1 < 0)
        {
            Shape t = array[left];
            array[left] = array[mid];
            array[mid] = t;
        }

        if(cmp2 < 0)
        {
            Shape t = array[left];
            array[left] = array[right];
            array[right] = t;
        }

        if(cmp3 < 0)
        {
            Shape t = array[mid];
            array[mid] = array[right];
            array[right] = t;
        }

        return mid;
    }
}