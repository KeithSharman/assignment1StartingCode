package utilities;

import java.util.Comparator;
import shapes.Shape;

public class InsertionSort {


    public static void insertionSort(Shape[] array, Comparator<Shape> comparator)
    {
        if(array == null || array.length <= 1)
        {
            return;
        }

        int size = array.length;

        for(int i = 1; i < size; i++)
        {
            Shape temp = array[i]; // current shape
            int j = i - 1;

            // move smaller shapes forward
            while(j >= 0)
            {
                int cmp = 0;

                if(comparator != null)
                {
                    cmp = comparator.compare(array[j], temp);
                }
                else
                {
                    cmp = array[j].compareTo(temp);
                }

                if(cmp < 0)
                {
                    array[j + 1] = array[j];
                    j--;
                }
                else
                {
                    break;
                }
            }

            // put the shape in the correct place
            array[j + 1] = temp;
        }
    }
}