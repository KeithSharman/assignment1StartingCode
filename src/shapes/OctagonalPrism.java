package shapes;

public class OctagonalPrism extends Shape
{
	private double edgeLength;

	public OctagonalPrism(double h, double edge)
	{
		super(h);
		edgeLength = edge;
	}

	@Override
	public double calcVolume()
	{
		double base = calcBaseArea();
		double volume = base * height;

		return volume;
	}

	@Override
	public double calcBaseArea()
	{
		// A = 2(1 + sqrt(2))s^2 - from formula sheet
		double s2 = edgeLength * edgeLength;
		double area = 2.0 * (1.0 + Math.sqrt(2)) * s2;

		return area;
	}
}