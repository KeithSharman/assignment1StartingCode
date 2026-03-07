package shapes;

import java.util.Comparator;

/**
 * use to compare two classes by height or area.
 * i.e shapes.sort(ShapeComparator.byArea());
 * or shapes.sort(ShapeComparator.byVolume());
 */

public class ShapeComparator {
	
	// I changed this slightly bc it forced a descending order. Assignment says it needs to be sthe sorting algorithm that does it
	// rather than the comparator.
	// Minor change but idk if she'll take marks off if left the way it was. 
	
	
    public static Comparator<Shape> byArea() {
        return (a, b) -> Double.compare(a.calcBaseArea(), b.calcBaseArea());
    }

    public static Comparator<Shape> byVolume() {
        return (a, b) -> Double.compare(a.calcVolume(), b.calcVolume());
    }
}
