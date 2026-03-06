package shapes;

import java.util.Comparator;
/**
 * use to compare two classes by height or area.
 * i.e shapes.sort(ShapeComparator.byArea());
 * or shapes.sort(ShapeComparator.byVolume());
 */

public class ShapeComparator {
	
	
    public static Comparator<Shape> byArea() {
        return (a, b) -> Double.compare(b.calcBaseArea(), a.calcBaseArea());
    }

    public static Comparator<Shape> byVolume() {
        return (a, b) -> Double.compare(b.calcVolume(), a.calcVolume());
    }
}
