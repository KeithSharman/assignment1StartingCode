package utilities;

import java.util.Comparator;
import shapes.Shape;

public class ShellSort {

    public static void shellSort(Shape[] array, Comparator<Shape> comparator) {

        if (array == null || array.length <= 1) {
            return;
        }

        
        int length = array.length;
        

        // start with big space for comparison
        for (int space = length / 2; space > 0; space = space / 2) {

            for (int i = space; i < length; i++) {

                Shape temp = array[i];
                int j = i;
                while (j >= space) {
                    int cmp = 0;
                    if (comparator != null) {
                        cmp = comparator.compare(temp, array[j - space]);
                    }
                    else {
                        cmp = array[j - space].compareTo(temp);
                    }

                    // keep big shapes in front
                    if (cmp < 0) {
                        array[j] = array[j - space];
                        j = j - space;
                    }
                    else {
                        break;
                    }
                }

                array[j] = temp;
            }
        }
    }
}