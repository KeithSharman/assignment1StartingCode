package shapes;

public class Pyramid {
	
	double height;
	double side;
	
	public Pyramid(double height, double side) {
		
		this.height = height;
		this.side = side;
	}
	
	@Override
	public double calcVolume() {
		return (1 / 3) * (side * side) * height;
	}
	
	@Override
	public double calcBaseArea() {
		
		return side * side;
	}
}
