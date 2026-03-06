package utilities;

import java.util.Comparator;

import shapes.Shape;

public class AreaComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.calcBaseArea(), o2.calcBaseArea());
	}

}
