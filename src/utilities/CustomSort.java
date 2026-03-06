package utilities;

import java.util.Comparator;
import shapes.Shape;

public class CustomSort {

	public static void gnomeSort(Shape[] array, Comparator<Shape> comparator) {
		if(array ==  null || array.length <= 1) {
			return;
		}
		
		int i = 0;
	
		while( i < array.length - 1) {
			
			int cmp;
		
			if (comparator != null) {
				cmp = comparator.compare(array[i], array[i + 1]);
			}
		
			else {
				cmp = array[i].compareTo(array[i + 1]);
			}
	
			//descending order:
			if (cmp < 0) {
				Shape temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
		
				if (i > 0) {
					i--;
				}
			}
			
			else {
				i++;
			}
		}
	}
}
