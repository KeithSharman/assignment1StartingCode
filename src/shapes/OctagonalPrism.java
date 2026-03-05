package shapes;

public class OctagonalPrism {
	
	double height;
	double side;
	
	public OctagonalPrism(double height, double side) {
		
		this.height = height;
		this.side = side;
	}
	
	@Override
	public double calcVolume() {
		
		
	}
	
	@Override
	public double calcBaseArea() {
		
		return 2 * (1 + Math.sqrt(2)) * (side * side);
	}
}
