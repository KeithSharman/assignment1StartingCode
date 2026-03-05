package shapes;

public class Cone {
	
	double height;
	double radius;
	
	public Cone(double height, double radius) {
		
		this.height = height;
		this.radius = radius;
	}
	
	@Override
	public double calcVolume() {
		return (1 / 3) * Math.PI * (radius * radius) * height;
	}
	
	@Override
	public double calcBaseArea() {
		return Math.PI * (radius * radius);
	}
}
