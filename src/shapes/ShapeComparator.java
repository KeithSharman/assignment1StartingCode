package shapes;

import java.util.Comparator;
/**
 * use to compare two classes by height or area.
 * i.e shapes.sort(ShapeComparator.byArea());
 * or shapes.sort(ShapeComparator.byVolume());
 */

public class ShapeComparator {
	
	//changed this bc it forced a descending order. needs to be sthe sorting algorithm that does it
	
	
    public static Comparator<Shape> byArea() {
        return (a, b) -> Double.compare(a.calcBaseArea(), b.calcBaseArea());
    }

    public static Comparator<Shape> byVolume() {
        return (a, b) -> Double.compare(a.calcVolume(), b.calcVolume());
    }
}
