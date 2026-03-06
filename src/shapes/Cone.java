/**
 * File: Cone.Java
 * Author Keith Sharman
 * Date: 2026-03-06
 * Description: holds information related to shapes, and 
 * calculates area and volume
 */
package shapes;
import static java.lang.Math.*;

public class Cone extends Shape
{
	private double radius;
	
	
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		return Math.PI * radius * radius * height / 3.0;
		
	}
	
	@Override
	public double calcBaseArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
	return "Cone " + height + " " + radius;
	}
}
