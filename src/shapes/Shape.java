package shapes;
import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
	
	protected double height;

	protected Shape(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract double calcBaseArea();
	public abstract double calcVolume();
	
	//comparable to compare shapes based on height in descending order
	@Override
	public int compareTo(Shape other) {
		return Double.compare(other.height,  this.height);
	}
	
	
}
